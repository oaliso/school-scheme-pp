document.addEventListener('DOMContentLoaded', () => {
    const materiaForm = document.getElementById('materiaForm');
    const faltasForm = document.getElementById('faltasForm');
    const listaMaterias = document.getElementById('listaMaterias');
    const materiaSelect = document.getElementById('materiaSelect');
    
    // Array para armazenar as matérias
    let materias = JSON.parse(localStorage.getItem('materias')) || [];
    
    // Função para salvar as matérias no localStorage
    function salvarMaterias() {
        localStorage.setItem('materias', JSON.stringify(materias));
    }
    
    // Função para calcular o status da matéria
    function calcularStatus(materia) {
        const percentualFaltas = (materia.faltasAtuais / materia.faltasPermitidas) * 100;
        
        if (percentualFaltas >= 100) {
            return { status: 'critico', texto: 'Crítico - Não pode mais faltar!' };
        } else if (percentualFaltas >= 75) {
            return { status: 'atencao', texto: 'Atenção - Faltas limitadas!' };
        } else {
            return { status: 'safe', texto: 'Seguro - Pode faltar mais' };
        }
    }
    
    // Função para atualizar a lista de matérias
    function atualizarListaMaterias() {
        listaMaterias.innerHTML = '';
        materiaSelect.innerHTML = '<option value="">Selecione uma matéria</option>';
        
        materias.forEach((materia, index) => {
            const status = calcularStatus(materia);
            const percentualFaltas = (materia.faltasAtuais / materia.faltasPermitidas) * 100;
            
            // Criar card da matéria
            const materiaCard = document.createElement('div');
            materiaCard.className = `materia-card ${status.status}`;
            
            materiaCard.innerHTML = `
                <div class="materia-header">
                    <span class="materia-nome">${materia.nome}</span>
                    <div class="materia-actions">
                        <span class="materia-status status-${status.status}">${status.texto}</span>
                        <button class="btn-edit" onclick="editarFaltas(${index})">
                            <i class="fas fa-edit"></i> Editar Faltas
                        </button>
                        <button class="btn-delete" onclick="excluirMateria(${index})">
                            <i class="fas fa-trash"></i> Excluir
                        </button>
                    </div>
                </div>
                <div class="materia-info">
                    <div class="info-item">
                        <strong>Total de Aulas:</strong> ${materia.totalAulas}
                    </div>
                    <div class="info-item">
                        <strong>Faltas Atuais:</strong> ${materia.faltasAtuais}
                    </div>
                    <div class="info-item">
                        <strong>Faltas Permitidas:</strong> ${materia.faltasPermitidas}
                    </div>
                    <div class="info-item">
                        <strong>Faltas Restantes:</strong> ${materia.faltasPermitidas - materia.faltasAtuais}
                    </div>
                </div>
                <div class="progress-bar">
                    <div class="progress-fill ${status.status}" style="width: ${percentualFaltas}%"></div>
                </div>
            `;
            
            listaMaterias.appendChild(materiaCard);
            
            // Adicionar opção no select
            const option = document.createElement('option');
            option.value = index;
            option.textContent = materia.nome;
            materiaSelect.appendChild(option);
        });
    }
    
    // Função para editar faltas
    window.editarFaltas = (index) => {
        const materia = materias[index];
        const novaQuantidade = prompt(`Digite o número correto de faltas para ${materia.nome}:`, materia.faltasAtuais);
        
        if (novaQuantidade !== null) {
            const faltas = parseInt(novaQuantidade);
            if (!isNaN(faltas) && faltas >= 0) {
                materias[index].faltasAtuais = faltas;
                salvarMaterias();
                atualizarListaMaterias();
            } else {
                alert('Por favor, digite um número válido maior ou igual a zero.');
            }
        }
    };
    
    // Função para excluir matéria
    window.excluirMateria = (index) => {
        if (confirm(`Tem certeza que deseja excluir a matéria "${materias[index].nome}"?`)) {
            materias.splice(index, 1);
            salvarMaterias();
            atualizarListaMaterias();
        }
    };
    
    // Evento para cadastrar nova matéria
    materiaForm.addEventListener('submit', (e) => {
        e.preventDefault();
        
        const nome = document.getElementById('nomeMateria').value;
        const totalAulas = parseInt(document.getElementById('totalAulas').value);
        const faltasPermitidas = parseInt(document.getElementById('faltasPermitidas').value);
        
        materias.push({
            nome,
            totalAulas,
            faltasPermitidas,
            faltasAtuais: 0
        });
        
        salvarMaterias();
        atualizarListaMaterias();
        materiaForm.reset();
    });
    
    // Evento para registrar faltas
    faltasForm.addEventListener('submit', (e) => {
        e.preventDefault();
        
        const materiaIndex = parseInt(materiaSelect.value);
        const quantidadeFaltas = parseInt(document.getElementById('quantidadeFaltas').value);
        
        if (materiaIndex >= 0 && materiaIndex < materias.length) {
            materias[materiaIndex].faltasAtuais += quantidadeFaltas;
            salvarMaterias();
            atualizarListaMaterias();
            faltasForm.reset();
        }
    });
    
    // Inicializar a lista de matérias
    atualizarListaMaterias();
}); 