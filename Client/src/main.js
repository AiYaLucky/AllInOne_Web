import Vue from 'vue';
import App from './App.vue';
import router from 'vue-router';
import Element from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import axios from "axios";
import global_ from "./components/Global.vue";
Vue.prototype.GLOBAL = global_;
Vue.prototype.$axios = axios;
axios.defaults.baseURL = global_.baseURL;
Vue.config.productionTip = false;
Vue.use(Element);
new Vue({
    router,
    render: h => h(App),
}).$mount('#app');
