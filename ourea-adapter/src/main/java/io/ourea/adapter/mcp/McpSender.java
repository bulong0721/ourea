package io.ourea.adapter.mcp;

import com.google.protobuf.MessageLite;

public interface McpSender {

    void send(MessageLite message);
}
