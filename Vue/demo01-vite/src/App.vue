<script setup>


//引入haha.vue文件

import haha from './components/haha.vue'

import heihei from './components/heihei.vue'



/*css样式的导入方法
第一种方法*/
import './style/test.css'
</script>


<!--template下面只能有一个一级标签-->
<template>


<span class="s1">你好</span>
  
 <h1 class="h1c1a">hello world</h1>

  <haha></haha>

  <heihei></heihei>

</template>

<style scoped>

.h1c1a{
  color: red;
} 




/*第二中css样式的导入方法
@import './style/test.css';*/
</style>
