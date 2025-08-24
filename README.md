# AI Workflow Use Cases

This repository showcases two GitHub Actions workflows powered by the [OpenAI Codex CLI](https://github.com/openai/codex) to automate common development tasks:

1.  **AI-Assisted Pull Request Reviews**: Automatically reviews code changes in pull requests and posts feedback as a comment.
2.  **Test Data Generation**: Generates test data for a sample Java application.

## Workflows

### 1. AI-Assisted Pull Request Reviews

This workflow runs automatically on every pull request to provide an AI-generated code review.

**File:** `.github/workflows/codex-pr-review.yml`

**How it works:**

- **Trigger**: Runs when a pull request is opened, synchronized, or reopened.
- **Process**:
  1.  Checks out the repository and identifies the changed files.
  2.  Generates a `diff` of the changes.
  3.  Calls the Codex CLI with a prompt that includes the file changes and diff, asking for a comprehensive review.
  4.  The AI's review is captured and posted as a comment on the pull request.
- **Configuration**: Requires an `OPENAI_API_KEY` secret to be set in the repository settings for authentication.

### 2. Test Data Generation

This workflow demonstrates how to use the Codex CLI to generate a test data file for a simple Java application.

**File:** `.github/workflows/codex-test-data-generation.yml`

**How it works:**

- **Trigger**: Can be run manually from the GitHub Actions tab (`workflow_dispatch`).
- **Process**:
  1.  Uses the Codex CLI to generate a `numbers.txt` file containing 10 comma-separated random integers.
  2.  Compiles the `Numbers.java` application.
  3.  Runs the compiled Java application, which reads the generated `numbers.txt` file.

#### Local Execution Example

You can also run the test data generation process locally:

```shell
# 1. Install the Codex CLI
npm install -g @openai/codex@latest

# 2. Configure environment variables
export CODEX_HOME="$(pwd)/.codex"
export OPENAI_API_KEY="your-openai-api-key"

# 3. Run the generation command
codex exec --full-auto "Generate a numbers.txt file with up to 10 comma-separated random integers between 1 and 100. Do it by yourself, without using a script, and write to disk using the filesystem MCP server."

# 4. Compile and run the Java application
javac Numbers.java
java Numbers
```

## References

- [OpenAI Codex CLI Repository](https://github.com/openai/codex)
- [Codex CLI Configuration](https://github.com/openai/codex/blob/main/codex-rs/config.md)