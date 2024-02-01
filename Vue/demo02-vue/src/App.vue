


 <!--<script setup>可以替换刚才的复杂的代码-->
<script >


import {ref,reactive} from 'vue'
export default {
  setup() {

    //定义一些要展示到html上的数据  变量/对象

    let counter = ref(1) //响应式数据

    //让counter自增的方法
    function increment() {
      counter.value++
    }
    //让counter自减的方法
    function decrement() {
      counter.value--
    }

    function show() {
    alert(counter.value)
    }
    return {
      counter,
      increment,
      decrement,
      show
    }
  }
}

/*响应时数据：在数据变化时，vue框架会将变量数据的最新值更新到dom树中，页面数据就是实时最新的
非响应时数据：在数据变化时，vue框架不会将变量数据的最新值更新到dom树中，页面数据不是实时最新的



vue3   数据要经过ref /reactive包装后才是响应式数据   方法导入即可使用


ref的使用  需要使用.value形式操作
在template中使用 无需使用.value形式操作
*/
</script>

<template>
<div>
  <button @click="increment">+</button>
  <span v-text="counter"></span>
  <button @click="decrement">-</button>
  <button @click="show"></button>
</div>

</template>

<style scoped>



</style>