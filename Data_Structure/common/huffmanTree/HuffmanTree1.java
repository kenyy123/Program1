package huffmanTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HuffmanTree1 {
	public static void main(String[] args) {  
        List<HffNode1> nodes = Arrays.asList( 
                 new HffNode1(1),  
                 new HffNode1(3),  
                 new HffNode1(5),  
                 new HffNode1(7)  
        );  
        HffNode1 node = build(nodes);  
        PrintTree(node);  
     }  
  
/** 
* 构造哈夫曼树 
* @param nodes 结点集合 
* @return 构造出来的树的根结点 
*/  
  
 private static HffNode1 build(List<HffNode1> nodes) {  
        nodes = new ArrayList<HffNode1>(nodes);  
        sortList(nodes);  
        while (nodes.size() > 1) {  
             createAndReplace(nodes);  
         }  
        return nodes.get(0);  
     }  
  
/** 
* 组合两个权值最小结点，并在结点列表中用它们的父结点替换它们 
* @param nodes 结点集合 
*/  
private static void createAndReplace(List<HffNode1> nodes) {  
	HffNode1 left = nodes.get(0);  
	HffNode1 right = nodes.get(1);  
	HffNode1 parent = new HffNode1(left.getValue() + right.getValue());  
         parent.setLeftChild(left);  
         parent.setRightChild(right);  
         nodes.remove(0);  
         nodes.remove(0);  
         nodes.add(parent);  
         sortList(nodes);  
     }  
  
/** 
* 将结点集合由大到小排序 
*/  
  
private static void sortList(List<HffNode1> nodes) {  
       Collections.sort(nodes);  
    }  
  
/** 
* 打印树结构，显示的格式是node(left,right) 
* @param node 
*/  
  
public static void PrintTree(HffNode1 node)  
{  
	HffNode1 left = null;  
	HffNode1 right = null;  
     if(node!=null)  
     {  
        System.out.print(node.getValue());  
        left = node.getLeftChild();  
        right = node.getRightChild();  
        System.out.println("("+(left!=null?left.getValue():" ") +","+ (right!= null?right.getValue():" ")+")");  
     }  
     if(left!=null)  
        PrintTree(left);  
     if(right!=null)  
        PrintTree(right);  
}  
}
