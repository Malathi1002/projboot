// package com.kgisl.ProjectBoot.service;

// import java.util.List;

// import javax.transaction.Transactional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.ModelAttribute;

// import com.kgisl.ProjectBoot.entity.Login;

// @Service
// public class LoginServiceImpl  implements LoginService
// {
//     @Autowired
//     private LoginRepository loginRepository;
    
//     @Override
//     @Transactional
//     public List<Login> getLogin() 
//     {
//         return loginRepository.getLogin();
//     }

//     @Override
//     public void saveLogin(@ModelAttribute("Login") Login theLogin) {
//         loginRepository.saveLogin(theLogin);
//         return;
        
//     }  


// }
