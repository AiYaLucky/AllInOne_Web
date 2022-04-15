<template>
  <div class="btn_main_div">
    <ButtonUrl buttonName="前往" name="站点名字" desc="站点描述站点描述站点描述站点描述"></ButtonUrl>
    <ButtonUrl buttonName="前往"></ButtonUrl>
    <ButtonUrl buttonName="前往"></ButtonUrl>
    <ButtonUrl buttonName="前往"></ButtonUrl>
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

.btn_main_div {
  display: flex;
  justify-content: space-around;
}

</style>