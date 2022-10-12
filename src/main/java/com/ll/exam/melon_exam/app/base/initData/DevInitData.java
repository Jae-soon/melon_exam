package com.ll.exam.melon_exam.app.base.initData;

import com.ll.exam.melon_exam.app.cart.service.CartService;
import com.ll.exam.melon_exam.app.member.service.MemberService;
import com.ll.exam.melon_exam.app.song.service.SongService;
import com.ll.exam.melon_exam.product.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData implements InitDataBefore {
    @Bean
    CommandLineRunner initData(MemberService memberService, SongService songService, ProductService productService, CartService cartService) {
        return args -> {
            before(memberService, songService, productService, cartService);
        };
    }
}