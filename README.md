```shell
npm install -g @openai/codex@latest
export CODEX_HOME="$(pwd)/.codex"
export OPENAI_API_KEY=sk-proj-xxx
codex exec --full-auto "Generate a numbers.txt file with up to 10 comma-separated random integers between 1 and 100. Do it by yourself, without using a script, and write to disk using the filesystem MCP server."
javac Numbers.java
java Numbers
```

# References

- https://github.com/openai/codex
- https://github.com/openai/codex/blob/main/codex-rs/config.md