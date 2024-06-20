<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>

    <div class="wrapper">

      <nav class="nav">
        <RouterLink to="/">Home</RouterLink> 
        <RouterLink to="/ola">Ola</RouterLink>
      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style scoped>

nav {
  display: flex;
  gap: 20px;
}

</style>
