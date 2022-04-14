<template>
  <div class="main_div">
    <div class="main_div1">
    </div>
    <div><ButtonUrl buttonName="前往" name="站点名字" desc="站点描述站点描述站点描述站点描述"></ButtonUrl></div>
    <div><ButtonUrl buttonName="前往"></ButtonUrl></div>
    <div><ButtonUrl buttonName="前往"></ButtonUrl></div>
  </div>
</template>

<script>
import ButtonUrl from "@/components/ButtonUrl";
export default {
  name: "FreeImage",
  components: {ButtonUrl},
  methods: {
    getUrl: function () {
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

<style>

.main_div {
  left: calc(50% - 600px);
  width: 1200px;
  height: auto;
  padding: 20px;
  border-radius: 10px;
  position: relative;
}

.main_div {
  left: calc(50% - 600px);
  width: 1200px;
  height: auto;
  background-color: #e7f3f3;
  padding: 20px;
  border-radius: 10px;
  box-shadow: 0 0 30px black;
  opacity: 75%;
  border: red solid;
  position: relative;
}

</style>