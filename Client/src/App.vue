<template>
  <div id="app">
    <img id="logo" alt="logo" src="./assets/logo.png">
    <img id="background" src="./assets/background.jpg" alt="background">
    <HelloWorld welcome-message='欢迎使用 ○ AiYaLucky ○ 导航'/>
  </div>
</template>

<script>
import HelloWorld from './components/Welcome.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

#logo{
  width: 234px;
  height: 234px;
}

#background {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 0;
  left: 0;
  z-index: -1;
}
</style>
