

//导入一个createApp函数
import { createApp } from 'vue'
//导读全局的css样式，该文件的样式或作用到所有的.vue元素中
import './style.css'

/*  第三种导入方式  导入全局的css文件
import './style.test.css'*/

//来导入App.vue组件
import App from './App.vue'
//使用createApp函数创建一个vue应用实例，然后使用mount函数将该实例挂载到id为app的元素上
createApp(App).mount('#app')
   