<template>
  <div class="main_div">
    <div class="btn_div">
      <button class="btn_default">默认按钮</button>
      <strong class="url_name">导航名字</strong>
      <br>
      <p class="url_desc">导航说明</p>
    </div>
    <div class="btn_div">
      <button class="btn_default">默认按钮</button>
    </div>
    <div class="btn_div">
      <button class="btn_default">默认按钮</button>
    </div>
    <div class="btn_div">
      <button class="btn_default">默认按钮</button>
    </div>
    <div class="btn_div">
      <button class="btn_default">默认按钮</button>
    </div>
    <div class="btn_div">
      <button class="btn_default">默认按钮</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "FreeImage",
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

.btn_div {
  width: 200px;
  height: 100px;
  background-color: aliceblue;
  position: relative;
  margin-bottom: 5px;
  margin-top: 5px;
}

.btn_default {
  position: absolute;
  width: 70px;
  height: 50px;
  text-align: center;
  left: 10%;
  top: calc(50% - 25px);
}

.main_div {
  left: calc(50% - 400px);
  width: 800px;
  height: auto;
  border: red solid;
  position: relative;
}

</style>