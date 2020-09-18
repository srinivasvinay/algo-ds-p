package com.algo.intro.hackerrank;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PermutationsTest {
   @Test
   public void testWhenAllCharsAreSame() throws Exception {
      Map<String, Integer> testMap = new HashMap<>();

      testMap.put("aaa", 1);
      testMap.put("abc", 6);
      testMap.put("aac", 3);
      testMap.put("a", 1);
      testMap.put("", 0);

      final Permutations cls = new Permutations();
      for (final Map.Entry<String, Integer> entry : testMap.entrySet()) {

         final List<String> permList = cls.listAllPermutationsForString2(entry.getKey());

         assertEquals((Integer) permList.size(), entry.getValue());

         final HashSet<String> uniqueValues = new HashSet<>();
         permList.forEach(str -> uniqueValues.add(str));
         assertEquals(permList.size(), uniqueValues.size());
      }

   }

   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(PermutationsTest.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString()+" "+failure.getTrace());
      }

      System.out.println("All the test cases passed : " + result.wasSuccessful());
   }

}