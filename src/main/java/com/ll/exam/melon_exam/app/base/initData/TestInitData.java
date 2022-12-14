package com.ll.exam.melon_exam.app.base.initData;

import com.ll.exam.melon_exam.app.cart.service.CartService;
import com.ll.exam.melon_exam.app.member.service.MemberService;
import com.ll.exam.melon_exam.app.order.service.OrderService;
import com.ll.exam.melon_exam.app.song.service.SongService;
import com.ll.exam.melon_exam.app.product.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestInitData implements InitDataBefore {
    @Bean
    CommandLineRunner initData(MemberService memberService, SongService songService, ProductService productService, CartService cartService, OrderService orderService) {
        return args -> {
            before(memberService, songService, productService, cartService, orderService);
        };
    }
}