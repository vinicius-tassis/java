<template>
    <div>
      <h1>Olá page</h1>

      <p>{{ message }}</p>
    </div>
  </template>

<script>

export default {
  data() {
    return {
      message: 'Olá da HOME',
    };
  },
  mounted() {
    this.fetchMessage();
  },
  methods: {
    async fetchMessage() {
      console.log("HOME");
    },
  },
};
</script>
  
  <style>
  
  </style>
  