```shell
export CODEX_HOME="$(pwd)/.codex"
export OPENAI_API_KEY=sk-proj-xxx
codex exec --full-auto "Generate a numbers.txt file with up to 10 comma-separated random integers between 1 and 100. Generate them by yourself, write the file using the filesystem MCP server and then stop. Do not run a script and do not validate the contents afterwards (not by listing the file, nor via git commands). Be as concise and fast as possible to save tokens."
```

# References

- https://github.com/openai/codex
- https://github.com/openai/codex/blob/main/codex-rs/config.md