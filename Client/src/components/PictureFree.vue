<!--免版权图片模块-->
<template id="pic">
  <div><button id="btn" @click="getPicFree()">图片资源</button></div>

</template>

<script>

export default {
  name: "PictureFree",
  methods: {
    getPicFree() {
      this.axios.post("http://localhost:8081/user/getUrl").then((response) => {
        alert(response.data);
      }).catch((response => {
        alert(response);
      }))
    }
  }
}


</script>

<style scoped>
#btn{
  margin-left: -50%;
}
</style>