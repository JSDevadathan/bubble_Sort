package com.example.bubbleSort.controller;

import com.example.bubbleSort.contract.request.SortRequest;
import com.example.bubbleSort.contract.response.SortResponse;
import com.example.bubbleSort.service.BubbleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BubbleSortController {
    private final BubbleService bubbleService;

    @PostMapping("/bubbleSort")
    public SortResponse bubbleSort(@RequestBody SortRequest sortRequest){
        return bubbleService.bubbleSort(sortRequest.getInputArray());
    }
}

