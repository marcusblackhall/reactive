package com.iamatum.iamatumreactivestreams.service;

import com.iamatum.iamatumreactivestreams.model.Quote;
import reactor.core.publisher.Flux;

import java.time.Duration;

public interface QuoteGeneratorService {

    Flux<Quote> fetchQuoteStream(Duration period);
}
