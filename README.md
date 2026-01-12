<h2><a href="https://leetcode.com/problems/valid-palindrome-ii">680. Valid Palindrome II</a></h2><h3>Easy</h3><hr><p>Given a string <code>s</code>, return <code>true</code> <em>if the </em><code>s</code><em> can be palindrome after deleting <strong>at most one</strong> character from it</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;aba&quot;
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abca&quot;
<strong>Output:</strong> true
<strong>Explanation:</strong> You could delete the character &#39;c&#39;.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abc&quot;
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of lowercase English letters.</li>
</ul>

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0011-container-with-most-water) |
| [0014-longest-common-prefix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0014-longest-common-prefix) |
| [0015-3sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0015-3sum) |
| [0018-4sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0018-4sum) |
| [0027-remove-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0027-remove-element) |
| [0031-next-permutation](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0031-next-permutation) |
| [0033-search-in-rotated-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0035-search-insert-position](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0035-search-insert-position) |
| [0042-trapping-rain-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0042-trapping-rain-water) |
| [0049-group-anagrams](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0049-group-anagrams) |
| [0054-spiral-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0054-spiral-matrix) |
| [0056-merge-intervals](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0056-merge-intervals) |
| [0073-set-matrix-zeroes](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0073-set-matrix-zeroes) |
| [0074-search-a-2d-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0074-search-a-2d-matrix) |
| [0075-sort-colors](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0075-sort-colors) |
| [0088-merge-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0088-merge-sorted-array) |
| [0136-single-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0136-single-number) |
| [0137-single-number-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0137-single-number-ii) |
| [0169-majority-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0169-majority-element) |
| [0179-largest-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0179-largest-number) |
| [0189-rotate-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0189-rotate-array) |
| [0238-product-of-array-except-self](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0238-product-of-array-except-self) |
| [0240-search-a-2d-matrix-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0240-search-a-2d-matrix-ii) |
| [0287-find-the-duplicate-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0287-find-the-duplicate-number) |
| [0540-single-element-in-a-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0540-single-element-in-a-sorted-array) |
| [0560-subarray-sum-equals-k](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0560-subarray-sum-equals-k) |
| [0566-reshape-the-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0566-reshape-the-matrix) |
| [0628-maximum-product-of-three-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0628-maximum-product-of-three-numbers) |
| [0852-peak-index-in-a-mountain-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0852-peak-index-in-a-mountain-array) |
| [0898-transpose-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0898-transpose-matrix) |
| [0941-sort-array-by-parity](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0941-sort-array-by-parity) |
| [1295-find-numbers-with-even-number-of-digits](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1295-find-numbers-with-even-number-of-digits) |
| [1470-shuffle-the-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1470-shuffle-the-array) |
| [1677-matrix-diagonal-sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1677-matrix-diagonal-sum) |
| [1791-richest-customer-wealth](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1791-richest-customer-wealth) |
| [2215-finding-3-digit-even-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2215-finding-3-digit-even-numbers) |
| [2965-find-missing-and-repeated-values](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2965-find-missing-and-repeated-values) |
## Math
|  |
| ------- |
| [0050-powx-n](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0050-powx-n) |
| [0067-add-binary](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0067-add-binary) |
| [0189-rotate-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0189-rotate-array) |
| [0231-power-of-two](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0231-power-of-two) |
| [0326-power-of-three](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0326-power-of-three) |
| [0342-power-of-four](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0342-power-of-four) |
| [0390-elimination-game](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0390-elimination-game) |
| [0628-maximum-product-of-three-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0628-maximum-product-of-three-numbers) |
| [1013-fibonacci-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1013-fibonacci-number) |
| [1295-find-numbers-with-even-number-of-digits](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1295-find-numbers-with-even-number-of-digits) |
| [2965-find-missing-and-repeated-values](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2965-find-missing-and-repeated-values) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0015-3sum) |
| [0018-4sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0018-4sum) |
| [0049-group-anagrams](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0049-group-anagrams) |
| [0056-merge-intervals](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0056-merge-intervals) |
| [0075-sort-colors](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0075-sort-colors) |
| [0088-merge-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0088-merge-sorted-array) |
| [0169-majority-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0169-majority-element) |
| [0179-largest-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0179-largest-number) |
| [0242-valid-anagram](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0242-valid-anagram) |
| [0628-maximum-product-of-three-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0628-maximum-product-of-three-numbers) |
| [0807-custom-sort-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0807-custom-sort-string) |
| [0941-sort-array-by-parity](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0941-sort-array-by-parity) |
| [2215-finding-3-digit-even-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2215-finding-3-digit-even-numbers) |
## Matrix
|  |
| ------- |
| [0054-spiral-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0054-spiral-matrix) |
| [0073-set-matrix-zeroes](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0073-set-matrix-zeroes) |
| [0074-search-a-2d-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0074-search-a-2d-matrix) |
| [0240-search-a-2d-matrix-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0240-search-a-2d-matrix-ii) |
| [0566-reshape-the-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0566-reshape-the-matrix) |
| [0898-transpose-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0898-transpose-matrix) |
| [1677-matrix-diagonal-sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1677-matrix-diagonal-sum) |
| [1791-richest-customer-wealth](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1791-richest-customer-wealth) |
| [2965-find-missing-and-repeated-values](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2965-find-missing-and-repeated-values) |
## Simulation
|  |
| ------- |
| [0054-spiral-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0054-spiral-matrix) |
| [0067-add-binary](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0067-add-binary) |
| [0566-reshape-the-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0566-reshape-the-matrix) |
| [0898-transpose-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0898-transpose-matrix) |
| [1910-remove-all-occurrences-of-a-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1910-remove-all-occurrences-of-a-substring) |
## String
|  |
| ------- |
| [0003-longest-substring-without-repeating-characters](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0003-longest-substring-without-repeating-characters) |
| [0008-string-to-integer-atoi](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0008-string-to-integer-atoi) |
| [0014-longest-common-prefix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0014-longest-common-prefix) |
| [0049-group-anagrams](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0049-group-anagrams) |
| [0067-add-binary](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0067-add-binary) |
| [0076-minimum-window-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0076-minimum-window-substring) |
| [0151-reverse-words-in-a-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0151-reverse-words-in-a-string) |
| [0179-largest-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0179-largest-number) |
| [0242-valid-anagram](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0242-valid-anagram) |
| [0443-string-compression](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0443-string-compression) |
| [0567-permutation-in-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0567-permutation-in-string) |
| [0709-to-lower-case](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0709-to-lower-case) |
| [0807-custom-sort-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0807-custom-sort-string) |
| [1108-defanging-an-ip-address](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1108-defanging-an-ip-address) |
| [1309-decrypt-string-from-alphabet-to-integer-mapping](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1309-decrypt-string-from-alphabet-to-integer-mapping) |
| [1910-remove-all-occurrences-of-a-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1910-remove-all-occurrences-of-a-substring) |
## Bit Manipulation
|  |
| ------- |
| [0067-add-binary](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0067-add-binary) |
| [0136-single-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0136-single-number) |
| [0137-single-number-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0137-single-number-ii) |
| [0191-number-of-1-bits](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0191-number-of-1-bits) |
| [0231-power-of-two](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0231-power-of-two) |
| [0287-find-the-duplicate-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0287-find-the-duplicate-number) |
| [0342-power-of-four](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0342-power-of-four) |
| [0461-hamming-distance](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0461-hamming-distance) |
## Divide and Conquer
|  |
| ------- |
| [0169-majority-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0169-majority-element) |
| [0191-number-of-1-bits](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0191-number-of-1-bits) |
| [0240-search-a-2d-matrix-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0240-search-a-2d-matrix-ii) |
## Hash Table
|  |
| ------- |
| [0003-longest-substring-without-repeating-characters](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0003-longest-substring-without-repeating-characters) |
| [0049-group-anagrams](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0049-group-anagrams) |
| [0073-set-matrix-zeroes](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0073-set-matrix-zeroes) |
| [0076-minimum-window-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0076-minimum-window-substring) |
| [0169-majority-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0169-majority-element) |
| [0242-valid-anagram](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0242-valid-anagram) |
| [0560-subarray-sum-equals-k](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0560-subarray-sum-equals-k) |
| [0567-permutation-in-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0567-permutation-in-string) |
| [0807-custom-sort-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0807-custom-sort-string) |
| [2215-finding-3-digit-even-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2215-finding-3-digit-even-numbers) |
| [2965-find-missing-and-repeated-values](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2965-find-missing-and-repeated-values) |
## Binary Search
|  |
| ------- |
| [0033-search-in-rotated-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0035-search-insert-position](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0035-search-insert-position) |
| [0074-search-a-2d-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0074-search-a-2d-matrix) |
| [0240-search-a-2d-matrix-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0240-search-a-2d-matrix-ii) |
| [0287-find-the-duplicate-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0287-find-the-duplicate-number) |
| [0540-single-element-in-a-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0540-single-element-in-a-sorted-array) |
| [0852-peak-index-in-a-mountain-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0852-peak-index-in-a-mountain-array) |
## Two Pointers
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0015-3sum) |
| [0018-4sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0018-4sum) |
| [0027-remove-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0027-remove-element) |
| [0031-next-permutation](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0031-next-permutation) |
| [0042-trapping-rain-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0042-trapping-rain-water) |
| [0075-sort-colors](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0075-sort-colors) |
| [0088-merge-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0088-merge-sorted-array) |
| [0151-reverse-words-in-a-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0151-reverse-words-in-a-string) |
| [0189-rotate-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0189-rotate-array) |
| [0287-find-the-duplicate-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0287-find-the-duplicate-number) |
| [0443-string-compression](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0443-string-compression) |
| [0567-permutation-in-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0567-permutation-in-string) |
| [0941-sort-array-by-parity](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0941-sort-array-by-parity) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0011-container-with-most-water) |
| [0179-largest-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0179-largest-number) |
## Dynamic Programming
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0042-trapping-rain-water) |
| [1013-fibonacci-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1013-fibonacci-number) |
## Recursion
|  |
| ------- |
| [0050-powx-n](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0050-powx-n) |
| [0231-power-of-two](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0231-power-of-two) |
| [0326-power-of-three](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0326-power-of-three) |
| [0342-power-of-four](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0342-power-of-four) |
| [0390-elimination-game](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0390-elimination-game) |
| [1013-fibonacci-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1013-fibonacci-number) |
| [2215-finding-3-digit-even-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2215-finding-3-digit-even-numbers) |
## Memoization
|  |
| ------- |
| [1013-fibonacci-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1013-fibonacci-number) |
## Enumeration
|  |
| ------- |
| [2215-finding-3-digit-even-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2215-finding-3-digit-even-numbers) |
## Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0042-trapping-rain-water) |
| [1910-remove-all-occurrences-of-a-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1910-remove-all-occurrences-of-a-substring) |
## Monotonic Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0042-trapping-rain-water) |
## Counting
|  |
| ------- |
| [0169-majority-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0169-majority-element) |
## Sliding Window
|  |
| ------- |
| [0003-longest-substring-without-repeating-characters](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0003-longest-substring-without-repeating-characters) |
| [0076-minimum-window-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0076-minimum-window-substring) |
| [0567-permutation-in-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0567-permutation-in-string) |
## Prefix Sum
|  |
| ------- |
| [0238-product-of-array-except-self](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0238-product-of-array-except-self) |
| [0560-subarray-sum-equals-k](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0560-subarray-sum-equals-k) |
## Trie
|  |
| ------- |
| [0014-longest-common-prefix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0014-longest-common-prefix) |
<!---LeetCode Topics End-->