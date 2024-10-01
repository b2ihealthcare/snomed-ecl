/* 
 * The expression constraint below evaluates to all concepts in the substrate that do not have a child or descendant within the sub-expression.
 * In this example the "bottom" descendants are leafs of the sub-hierarchy starting with 224777007|Physical environment| and concepts like
 * 224786002 |Open air environment| will not be present in the result set as they also have a child concept within the same sub-hierarchy. 
 */
  
!!< (<< 224777007|Physical environment|)