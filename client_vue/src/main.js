import Vue from 'vue'
import App from './App.vue'
import router from './router'
import './assets/css/aiylucky_style.css'
import './assets/css/bootstrap.css'
import './assets/css/fonts/linecons/css/linecons.css'
Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
