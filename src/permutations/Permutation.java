package permutations;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Permutation
{
//---------------------- Getters and setters ----------------------------------

  public Set<Integer> getPermutationSet()
  {
    return permutationSet;
  }

  public void setPermutationSet(Set<Integer> permutationSet)
  {
    this.permutationSet = permutationSet;
  }

  public Set<Integer> getCombinations()
  {
    return combinations;
  }

  public void setCombinations(Set<Integer> combinations)
  {
    this.combinations = combinations;
  }







  //------------------------------  my ----------------------------------------

  private Set<Integer> permutationSet = new HashSet<Integer>();
  private Set<Integer> combinations = new HashSet<Integer>();
//  Iterator<Integer> combinationsIterator = combinations.iterator();  // not used for now

  public Permutation(Integer arr[])
  {
    for (Integer item: arr )
    {
      permutationSet.add(item);
      permute();
    };
  }

  public void permute()
  {

  }








}