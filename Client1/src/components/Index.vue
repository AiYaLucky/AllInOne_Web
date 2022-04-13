<template>
  <div id="main_div">
    <el-container>
      <el-header id="el-header">
        <img id="logo_bg" alt="Vue logo" src="../assets/background.jpg">
        <img id="logo" alt="Vue logo" src="../assets/logo.png">
      </el-header>

      <el-main id="el-main">
        <PictureFree></PictureFree>
      </el-main>
    </el-container>
    <!--添加跳转不同模块页面-->
    <div>

    </div>
  </div>
</template>

<script>
import PictureFree from "./PictureFree";

export default {
  name: 'Index',
  components: {PictureFree},
  props: {
    msg: String
  }
}
</script>

<style scoped>
#el-main {
  text-align: center;
  line-height: 350px;
}

#el-header {
  text-align: center;
  line-height: 180px;
}

#logo_bg {
  opacity: 75%;
  position: absolute;
  width: 100%;
  height: 100%;
  min-height: 750px;
  min-width: 1450px;
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
  margin-left: 45%;
}
</style>
