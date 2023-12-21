package com.example.bubbleSort.service;

import com.example.bubbleSort.contract.response.SortResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BubbleService {
    public SortResponse bubbleSort(int[] inputArray) {
        long startTime = System.nanoTime();

        int n=inputArray.length;
        for (int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(inputArray[j] > inputArray[j+1]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        return new SortResponse(inputArray, executionTime);
    }
}
