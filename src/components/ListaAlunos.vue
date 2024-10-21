<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';

const loading = ref(false);
const listaAlunos = ref([]);

const listAlunos = () => {
    loading.value = true;

    try {
        const result = [
            { id: 1, matricula: "202401", nome: "Ana Souza", ativo: true },
            { id: 2, matricula: "202402", nome: "Carlos Pereira", ativo: false },
            { id: 3, matricula: "202403", nome: "Beatriz Lima", ativo: true },
            { id: 4, matricula: "202404", nome: "Diego Ferreira", ativo: false },
            { id: 5, matricula: "202405", nome: "Eduardo Santos", ativo: true },
            { id: 6, matricula: "202406", nome: "Fernanda Oliveira", ativo: true },
            { id: 7, matricula: "202407", nome: "Gabriel Costa", ativo: false },
            { id: 8, matricula: "202408", nome: "Helena Martins", ativo: true },
            { id: 9, matricula: "202409", nome: "Igor Almeida", ativo: false },
            { id: 10, matricula: "202410", nome: "Juliana Rodrigues", ativo: true }
    ];

        listaAlunos.value = result;
    } catch(error) {
        message.error("Erro: ", error.data.mensagens);
    } finally {
        loading.value = false;
    }
}

onMounted(() => {
    listAlunos();
});
</script>
<template>
    <table class="table table-striped table-hover">
        <thead>
            <tr>

            </tr>
        </thead>
        <tbody>
            <tr v-for="aluno in listaAlunos" :key="aluno.id">
                <td>{{ aluno.matricula }}</td>
                <td>{{ aluno.nome }}</td>
                <td>{{ aluno.ativo ? 'Sim' : 'Não' }}</td>
            </tr>
        </tbody>
    </table>
</template>