<template>
  <!--  背景白色半透明  -->
  <div class="bg_main_div">
    <FreeImage></FreeImage>
    <FreeImage></FreeImage>
    <FreeImage></FreeImage>
    <FreeImage></FreeImage>
  </div>

</template>

<script>
import FreeImage from "@/components/FreeImage";
import BarType from "@/components/BarType";

export default {
  name: "AlphaBg",
  components: {BarType, FreeImage}

}
</script>

<style scoped>
.bg_main_div {
  /*设置控件的宽高针对当前页面大小尺寸*/
  width: 72vw;
  height: 65vh;
  /*设置控件的边距*/
  margin: 140px 25vh auto;
  /*设置背景颜色和透明度*/
  background-color: rgba(255,255,255, 1);
  /*设置四个角的弧度*/
  border-radius: 25px 30px 10px 10px;
  /*设置边框光效*/
  box-shadow: 0 0 20px black;
  /*x轴固定影藏，Y轴可以滚动*/
  overflow-x: hidden;
  overflow-y: scroll;
  position: fixed;
  /*变宽颜色和粗细*/
  border: rgba(0, 0, 0, 0.01) solid 1px;
}
/*实现控件滚动的时候右侧滚动条的影藏*/
.bg_main_div::-webkit-scrollbar { width: 0 !important }
.bg_main_div { -ms-overflow-style: none; }
.bg_main_div { overflow: -moz-scrollbars-none; }
</style>