<template>
    <div>
      <h1>Olá page</h1>

      <p>{{ message }}</p>
    </div>
  </template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      message: 'EM BRANCO',
    };
  },
  mounted() {
    this.fetchMessage();
  },
  methods: {
    async fetchMessage() {
      try {
        const response = await axios.get('http://localhost:8081/api-ola');
        this.message = response.data.mensagem;
      } catch (error) {
        console.error('Error fetching message:', error);
      }
    },
  },
};
</script>
  
  <style>
  
  </style>
  