package com.example.mylibrary.controller;

import com.example.mylibrary.model.Author;
import com.example.mylibrary.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public String listAuthors(Model model) {
        model.addAttribute("authors", authorService.getAllAuthors());
        return "authors/list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("author", new Author());
        return "authors/form";
    }

    @PostMapping
    public String createAuthor(@Valid @ModelAttribute Author author, BindingResult result) {
        if (result.hasErrors()) {
            return "authors/form";
        }
        authorService.saveAuthor(author);
        return "redirect:/authors";
    }

    @GetMapping("/{id}")
    public String viewAuthor(@PathVariable Long id, Model model) {
        Author author = authorService.getAuthorById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid author Id:" + id));
        model.addAttribute("author", author);
        return "authors/view";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Author author = authorService.getAuthorById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid author Id:" + id));
        model.addAttribute("author", author);
        return "authors/form";
    }

    @PostMapping("/{id}")
    public String updateAuthor(@PathVariable Long id, @Valid @ModelAttribute Author author, BindingResult result) {
        if (result.hasErrors()) {
            return "authors/form";
        }
        author.setId(id);
        authorService.saveAuthor(author);
        return "redirect:/authors";
    }

    @PostMapping("/{id}/delete")
    public String deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
        return "redirect:/authors";
    }
}
