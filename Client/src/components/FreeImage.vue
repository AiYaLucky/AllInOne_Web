<template>
<!--<img id="FreeImages" src="../assets/logo.png" @click="getUrl()">-->
</template>

<script>
export default {
  name: "CopyrightFreeImages",
  methods: {
    getUrl: function() {
      alert(this.GLOBAL.BASE_URL + "user/getPic")
      this.$axios.get(this.GLOBAL.BASE_URL + "user/getPic")
          .then(response => {
            console.log(response.data);
            //打开一个新的页面
            window.open(response.data.url, "_blank");
          })
          .catch(error => {
            alert(error);
          });
    }
  },
}
</script>

<style scoped>

</style>