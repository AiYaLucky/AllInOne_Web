<template>
  <div>
    <h1 id="welcome">{{ welcomeMessage }}</h1>
    <br>
    <h4 id="text">
      <br>
      这个导航的核心目的是为了让大家抛开各种无聊繁杂的网址记录
      <br>
      随着你的网龄越长，你的网页收藏夹内容也会越来越多，甚至会出现很久不用失效灯问题。
      <br>
      您只需要记录这一个导航的网址，以后各种类型不同类别的网址，会越来越多哒~
      <br>
      网址很好记：哎呀！幸运呢！~ 希望每一个遇到的我们都是幸运的！~
      <br>
      Ai Ya！Lucky！~
      <br>
    </h4>
    <CopyrightFreeImages></CopyrightFreeImages>
  </div>

</template>

<script>
import CopyrightFreeImages from "@/components/CopyrightFreeImages";
export default {
  name: 'Welcome',
  components: {CopyrightFreeImages},
  props: {
    welcomeMessage: String,
    description: String,
  }
}
</script>

<style>
#welcome {
  color: #F4606C;
}

#text {
  color: #19CAAD;
  margin-top: -50px;
}
</style>