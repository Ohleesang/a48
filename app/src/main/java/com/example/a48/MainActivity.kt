package com.example.a48

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
                var answer = Array<Int>(commands.size,{0})
                //배열 i~j번째 짜르고 정렬이후 k번째있는 수
                var result = mutableListOf<IntArray>()
                //commands 갯수만큼 리스트에 입력
                for(i in 0.. commands.size-1){
                    result.add(array.sliceArray(commands[i][0]-1..commands[i][1]-1))
                }
                // result 각 배열 정렬후 answer에 값 넣기
                for(i in 0..result.size-1){
                    result[i].sort()
                    answer[i] = result[i][commands[i][2]-1]
                }
                return answer.toIntArray()
            }
        }
        val a = Solution()
        a.solution(intArrayOf(1,5,2,6,3,7,4),arrayOf<IntArray>(intArrayOf(2,5,3),intArrayOf(4,4,1),intArrayOf(1,7,3)))
    }
}