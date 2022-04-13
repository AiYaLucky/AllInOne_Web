import Vue, { createApp } from 'vue'
import App from './App.vue'

// createApp(App).mount('#app')
new Vue(App).$mount('#app')

import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.use(ElementUI);

import   axios  from  'axios'
import  VueAxios from  'vue-axios'
Vue.use(VueAxios,axios);
