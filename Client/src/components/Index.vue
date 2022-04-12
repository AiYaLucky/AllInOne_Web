<template>
  <div id="main_div">
    <img id="logo_bg" alt="Vue logo" src="../assets/background.jpg">
    <img id="logo" alt="Vue logo" src="../assets/logo.png">
  </div>
  <br>

  <!--添加跳转不同模块页面-->
  
</template>

<script>
export default {
  name: 'Index',
  props: {
    msg: String
  }
}
</script>

<style scoped>

#logo_bg {
  opacity: 75%;
  position: absolute;
  width: 100%;
  height: 100%;
  min-height: 750px;
  top: 0;
  left: 0;
  right: 0;
  z-index: -1;
  margin: auto;
}

#logo {
  max-width: 180px;
  max-height: 180px;
  position: relative;

}
</style>
