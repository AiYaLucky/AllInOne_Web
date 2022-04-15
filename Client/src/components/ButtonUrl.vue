<template>
  <div class="btn_div">
<!--    <button class="btn_default">{{ buttonName }}</button>-->
    <button id="btn_default" class="button button-glow button-border button-rounded button-primary">{{ buttonName }}</button>
    <strong id="site_name">{{ name }}</strong>
    <p id="site_desc">{{ desc }}</p>
  </div>
</template>

<script>

export default {
  name: "ButtonUrl",
  methods:{
    data:{

    }
  },
  props: {
    buttonName: {
      type: String,
      default: "Button"
    },
    name: {
      type: String,
      default: "Site"
    },
    desc: {
      type: String,
      default: "Description"
    }
  }
}
</script>

<style scoped>
@import "../assets/buttons.css";

.btn_div {
  top: 30PX;
  width: 220px;
  height: 100px;
  background-color: rgba(214,213,183,85%);
  position: relative;
  margin-top: 30px;
  border-radius: 10PX;
}

#btn_default {
  position: absolute;
  width: 60px;
  height: 60px;
  text-align: center;
  vertical-align: middle;
  line-height: 15px;
  color: #f4606c;
  display: table-cell;
  font-size: 16px;
  font-weight: bolder;
  background-color: rgba(244,96,108,55%);
  left: 5%;
  top: calc(50% - 30px);
  border-radius: 20px 20px 20px 20px;
  padding: 0;
}

#site_name {
  position: absolute;
  top: 15px;
  font-size: 20px;
  color: #19caad;
}

#site_desc {
  position: absolute;
  top: 35px;
  font-size: 14px;
  right: 35px;
  left: 78px;
  width: 120px;
  color: #0eb0c9;
}
</style>