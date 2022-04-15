<!--导航总类横条-->
<template>
  <div id="type_bar_div">
<!--    &lt;!&ndash;在线VIP   固定第一个，左上角的弧度处理&ndash;&gt;-->
<!--    <button @click="showVipOnline()" class="type_btn_first"><h6 class="type_name">在线VIP</h6></button>-->
<!--    &lt;!&ndash;免版权图片&ndash;&gt;-->
<!--    <button @click="showPicture()" class="type_btn"><h6 class="type_name">免版权图片</h6></button>-->
<!--    &lt;!&ndash;其他固定在最后一个，不要动位置，主要是右上角的弧度处理&ndash;&gt;-->
<!--    <button @click="showOther()" class="type_btn_last"><h5 class="type_name">其他</h5></button>-->
    <div class="button-group">
      <button @click="showOther()" type="button" class="button button-pill button-action">Option 1</button>
      <button @click="showOther()" type="button" class="button button-pill button-action">Option 2</button>
      <button @click="showOther()" type="button" class="button button-pill button-action">Option 3</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "BarType",
  methods: {
    showOther: function () {
    }
  }

}
</script>

<style scoped>
@import "../assets/buttons.css";
#type_bar_div {
  border-radius: 10PX;
  margin: 140px 25vh auto;
  position: absolute;
  z-index: 1;
}

.type_btn_first {
  width: 24vw;
  height: 40px;
  border-radius: 10px 0 0 0;
  background-color: rgba(122, 232, 216, 100%);
  z-index: 2;
  /*border: #003bff solid 1px;*/
  border-width: thin;
}


.type_btn {
  width: 24vw;
  height: 40px;
  z-index: 2;
  /*border: #003bff solid 1px;*/
  background-color: rgba(122, 232, 216, 100%);
  border-width: thin;
  border-left: blue;
}

.type_btn_last {
  width: 24vw;
  height: 40px;
  border-radius: 0 10px 0 0;
  background-color: rgba(122, 232, 216, 100%);
  z-index: 2;
  /*border: #003bff solid 1px;*/
  border-width: thin;
}

.type_name {
  font-size: 16px;
  margin: auto;
  color: green;
}

</style>