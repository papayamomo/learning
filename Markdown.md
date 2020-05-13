#### 代码
``` Java
public static void main(String[] args) {
    System.out.println("Hello");
}
```

#### To-do List
- [x] 已完成1
- - [x] 子任务
  - [x] 子任务
- [ ] 未完成


#### 流程图
```
graph TB
    A[Christmas] --> B(Go Shopping)
    B --> C{Let me think}
    C --> | One| D[Laptop]
    C --> |Two| E[iPhone]
    C --> |Three| F[Car]
```

#### 序列图
```
sequenceDiagram
    loop every day
        Alice->>John: Hello John, how are you?
        John-->>Alice:Greate!
    end
```


#### 甘特图
```
gantt
dateFormat YYYY-MM-DD
title 产品计划
section 初期阶段
明确需求: 2016-03-01, 10d
section 中期阶段
跟进开发: 2016-03-11, 15d
section 后期开发
走查测试: 2016-03-20, 9d
```


#### 表格
| Item | Value | Qty |
| :-----| -----:| :--:|
|Computer|1600 USD | 5 |
Phone | 12 USD | 12 |
|Pipe | 1 USD | 234 | 

#### 数学公式 `$y = x^2$`

Inline math: `$\dfrac{
\tfrac{1}{2}[1-(\tfrac{1}{2}^n]}{
1-\tfrac{1}{2}}=s_n$`.

```math
\oint_C x^3\, dx + 4y^2\, dy

Z = \left(
\frac{\left(3-x\right) \ times 2}{3-x}
\right)
```


# 一级标题
## 二级标题
### 三级标题
#### 四级标题

#### 无序列表
- 列表1
    - 列表1.1
    - 列表1.2
- 列表2
- 列表3
- 
#### 有序列表
1. 列表1
    1. 列表1.1
    2. 列表1.2
2. 列表2
3. 列表3



#### 引用
> 记录， 成为更好的自己。 -- 有道云笔记。

*这是斜体*
**这是粗体**

#### 插入链接

[有道云笔记官网](http://note.youdao.com)

#### 插入图片
![有道云笔记](http://note.youdao.com/favicon.ico)

#### 分割线

这是第一段
***
这是第二段


#### 表格
header 1 | hedaer 2
---|---
row 1 col 1 | row 1 col 2
row 2 col 1|row 2 col 2


#### 流程图
TB - top bottom（自上而下）
BT - bottom top（自下而上）
RL - right left（从右到左）
LR - left right（从左到右）
```
graph TB
A-->B
```
```
graph RL
A-->B
```

```
graph LR
A((这是圆))
---
B{菱形}
```
