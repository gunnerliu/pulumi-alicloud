// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CommandState extends com.pulumi.resources.ResourceArgs {

    public static final CommandState Empty = new CommandState();

    /**
     * The Contents of the Script to Base64 Encoded Transmission.
     * 
     */
    @Import(name="commandContent")
    private @Nullable Output<String> commandContent;

    /**
     * @return The Contents of the Script to Base64 Encoded Transmission.
     * 
     */
    public Optional<Output<String>> commandContent() {
        return Optional.ofNullable(this.commandContent);
    }

    /**
     * The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
     * 
     */
    @Import(name="commandType")
    private @Nullable Output<String> commandType;

    /**
     * @return The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
     * 
     */
    public Optional<Output<String>> commandType() {
        return Optional.ofNullable(this.commandType);
    }

    /**
     * That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
     * 
     */
    @Import(name="contentEncoding")
    private @Nullable Output<String> contentEncoding;

    /**
     * @return That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
     * 
     */
    public Optional<Output<String>> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    /**
     * The desktop id of the Desktop.
     * 
     */
    @Import(name="desktopId")
    private @Nullable Output<String> desktopId;

    /**
     * @return The desktop id of the Desktop.
     * 
     */
    public Optional<Output<String>> desktopId() {
        return Optional.ofNullable(this.desktopId);
    }

    /**
     * Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The timeout period for script execution the unit is seconds. Default to: `60`.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return The timeout period for script execution the unit is seconds. Default to: `60`.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private CommandState() {}

    private CommandState(CommandState $) {
        this.commandContent = $.commandContent;
        this.commandType = $.commandType;
        this.contentEncoding = $.contentEncoding;
        this.desktopId = $.desktopId;
        this.status = $.status;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommandState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommandState $;

        public Builder() {
            $ = new CommandState();
        }

        public Builder(CommandState defaults) {
            $ = new CommandState(Objects.requireNonNull(defaults));
        }

        /**
         * @param commandContent The Contents of the Script to Base64 Encoded Transmission.
         * 
         * @return builder
         * 
         */
        public Builder commandContent(@Nullable Output<String> commandContent) {
            $.commandContent = commandContent;
            return this;
        }

        /**
         * @param commandContent The Contents of the Script to Base64 Encoded Transmission.
         * 
         * @return builder
         * 
         */
        public Builder commandContent(String commandContent) {
            return commandContent(Output.of(commandContent));
        }

        /**
         * @param commandType The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
         * 
         * @return builder
         * 
         */
        public Builder commandType(@Nullable Output<String> commandType) {
            $.commandType = commandType;
            return this;
        }

        /**
         * @param commandType The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
         * 
         * @return builder
         * 
         */
        public Builder commandType(String commandType) {
            return commandType(Output.of(commandType));
        }

        /**
         * @param contentEncoding That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
         * 
         * @return builder
         * 
         */
        public Builder contentEncoding(@Nullable Output<String> contentEncoding) {
            $.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * @param contentEncoding That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
         * 
         * @return builder
         * 
         */
        public Builder contentEncoding(String contentEncoding) {
            return contentEncoding(Output.of(contentEncoding));
        }

        /**
         * @param desktopId The desktop id of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder desktopId(@Nullable Output<String> desktopId) {
            $.desktopId = desktopId;
            return this;
        }

        /**
         * @param desktopId The desktop id of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder desktopId(String desktopId) {
            return desktopId(Output.of(desktopId));
        }

        /**
         * @param status Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param timeout The timeout period for script execution the unit is seconds. Default to: `60`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The timeout period for script execution the unit is seconds. Default to: `60`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public CommandState build() {
            return $;
        }
    }

}
