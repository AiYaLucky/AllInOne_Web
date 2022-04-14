<template>
  <div class="btn_div">
    <button class="btn_default">{{ buttonName }}</button>
    <strong id="site_name">{{ name }}</strong>
    <p id="site_desc">{{ desc }}</p>
  </div>
</template>

<script>

export default {
  name: "ButtonUrl",
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
.btn_default {
  position: absolute;
  width: 50px;
  height: 50px;
  text-align: center;
  left: 10%;
  top: calc(50% - 25px);
}

.btn_div {
  width: 200px;
  height: 100px;
  left: 10px;
  background-color: #4854ec;
  position: relative;
  margin-bottom: 10px;
  margin-top: 10px;
}
#site_name {
  position: absolute;
  top: 15px;
  font-size: 20px;
  color: #fff;
}

#site_desc {
  position: absolute;
  top: 30px;
  font-size: 14px;
  right: 35px;
  left: 80px;
  width: 120px;
  color: #fff;
}
</style>