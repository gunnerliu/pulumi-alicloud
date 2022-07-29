// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.ga.inputs.ListenerCertificateArgs;
import com.pulumi.alicloud.ga.inputs.ListenerPortRangeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerArgs Empty = new ListenerArgs();

    /**
     * The accelerator id.
     * 
     */
    @Import(name="acceleratorId", required=true)
    private Output<String> acceleratorId;

    /**
     * @return The accelerator id.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }

    /**
     * The certificates of the listener.
     * 
     */
    @Import(name="certificates")
    private @Nullable Output<List<ListenerCertificateArgs>> certificates;

    /**
     * @return The certificates of the listener.
     * 
     */
    public Optional<Output<List<ListenerCertificateArgs>>> certificates() {
        return Optional.ofNullable(this.certificates);
    }

    /**
     * The clientAffinity of the listener. Default value is `NONE`. Valid values:
     * `NONE`: client affinity is not maintained, that is, connection requests from the same client cannot always be directed to the same terminal node.
     * `SOURCE_IP`: maintain client affinity. When a client accesses a stateful application, all requests from the same client can be directed to the same terminal node, regardless of the source port and protocol.
     * 
     */
    @Import(name="clientAffinity")
    private @Nullable Output<String> clientAffinity;

    /**
     * @return The clientAffinity of the listener. Default value is `NONE`. Valid values:
     * `NONE`: client affinity is not maintained, that is, connection requests from the same client cannot always be directed to the same terminal node.
     * `SOURCE_IP`: maintain client affinity. When a client accesses a stateful application, all requests from the same client can be directed to the same terminal node, regardless of the source port and protocol.
     * 
     */
    public Optional<Output<String>> clientAffinity() {
        return Optional.ofNullable(this.clientAffinity);
    }

    /**
     * The description of the listener.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the listener.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the listener. The length of the name is 2-128 characters. It starts with uppercase and lowercase letters or Chinese characters. It can contain numbers and underscores and dashes.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the listener. The length of the name is 2-128 characters. It starts with uppercase and lowercase letters or Chinese characters. It can contain numbers and underscores and dashes.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The portRanges of the listener.
     * 
     */
    @Import(name="portRanges", required=true)
    private Output<List<ListenerPortRangeArgs>> portRanges;

    /**
     * @return The portRanges of the listener.
     * 
     */
    public Output<List<ListenerPortRangeArgs>> portRanges() {
        return this.portRanges;
    }

    /**
     * Type of network transport protocol monitored. Default value is `TCP`. Valid values: `TCP`, `UDP`, `HTTP`, `HTTPS`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Type of network transport protocol monitored. Default value is `TCP`. Valid values: `TCP`, `UDP`, `HTTP`, `HTTPS`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The proxy protocol of the listener. Default value is `false`. Valid value:
     * `true`: Turn on the keep client source IP function. After it is turned on, the back-end service is supported to view the original IP address of the client.
     * `false`: keep client source IP function is not turned on.
     * 
     */
    @Import(name="proxyProtocol")
    private @Nullable Output<Boolean> proxyProtocol;

    /**
     * @return The proxy protocol of the listener. Default value is `false`. Valid value:
     * `true`: Turn on the keep client source IP function. After it is turned on, the back-end service is supported to view the original IP address of the client.
     * `false`: keep client source IP function is not turned on.
     * 
     */
    public Optional<Output<Boolean>> proxyProtocol() {
        return Optional.ofNullable(this.proxyProtocol);
    }

    private ListenerArgs() {}

    private ListenerArgs(ListenerArgs $) {
        this.acceleratorId = $.acceleratorId;
        this.certificates = $.certificates;
        this.clientAffinity = $.clientAffinity;
        this.description = $.description;
        this.name = $.name;
        this.portRanges = $.portRanges;
        this.protocol = $.protocol;
        this.proxyProtocol = $.proxyProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerArgs $;

        public Builder() {
            $ = new ListenerArgs();
        }

        public Builder(ListenerArgs defaults) {
            $ = new ListenerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The accelerator id.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(Output<String> acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param acceleratorId The accelerator id.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            return acceleratorId(Output.of(acceleratorId));
        }

        /**
         * @param certificates The certificates of the listener.
         * 
         * @return builder
         * 
         */
        public Builder certificates(@Nullable Output<List<ListenerCertificateArgs>> certificates) {
            $.certificates = certificates;
            return this;
        }

        /**
         * @param certificates The certificates of the listener.
         * 
         * @return builder
         * 
         */
        public Builder certificates(List<ListenerCertificateArgs> certificates) {
            return certificates(Output.of(certificates));
        }

        /**
         * @param certificates The certificates of the listener.
         * 
         * @return builder
         * 
         */
        public Builder certificates(ListenerCertificateArgs... certificates) {
            return certificates(List.of(certificates));
        }

        /**
         * @param clientAffinity The clientAffinity of the listener. Default value is `NONE`. Valid values:
         * `NONE`: client affinity is not maintained, that is, connection requests from the same client cannot always be directed to the same terminal node.
         * `SOURCE_IP`: maintain client affinity. When a client accesses a stateful application, all requests from the same client can be directed to the same terminal node, regardless of the source port and protocol.
         * 
         * @return builder
         * 
         */
        public Builder clientAffinity(@Nullable Output<String> clientAffinity) {
            $.clientAffinity = clientAffinity;
            return this;
        }

        /**
         * @param clientAffinity The clientAffinity of the listener. Default value is `NONE`. Valid values:
         * `NONE`: client affinity is not maintained, that is, connection requests from the same client cannot always be directed to the same terminal node.
         * `SOURCE_IP`: maintain client affinity. When a client accesses a stateful application, all requests from the same client can be directed to the same terminal node, regardless of the source port and protocol.
         * 
         * @return builder
         * 
         */
        public Builder clientAffinity(String clientAffinity) {
            return clientAffinity(Output.of(clientAffinity));
        }

        /**
         * @param description The description of the listener.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the listener.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the listener. The length of the name is 2-128 characters. It starts with uppercase and lowercase letters or Chinese characters. It can contain numbers and underscores and dashes.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the listener. The length of the name is 2-128 characters. It starts with uppercase and lowercase letters or Chinese characters. It can contain numbers and underscores and dashes.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param portRanges The portRanges of the listener.
         * 
         * @return builder
         * 
         */
        public Builder portRanges(Output<List<ListenerPortRangeArgs>> portRanges) {
            $.portRanges = portRanges;
            return this;
        }

        /**
         * @param portRanges The portRanges of the listener.
         * 
         * @return builder
         * 
         */
        public Builder portRanges(List<ListenerPortRangeArgs> portRanges) {
            return portRanges(Output.of(portRanges));
        }

        /**
         * @param portRanges The portRanges of the listener.
         * 
         * @return builder
         * 
         */
        public Builder portRanges(ListenerPortRangeArgs... portRanges) {
            return portRanges(List.of(portRanges));
        }

        /**
         * @param protocol Type of network transport protocol monitored. Default value is `TCP`. Valid values: `TCP`, `UDP`, `HTTP`, `HTTPS`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Type of network transport protocol monitored. Default value is `TCP`. Valid values: `TCP`, `UDP`, `HTTP`, `HTTPS`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param proxyProtocol The proxy protocol of the listener. Default value is `false`. Valid value:
         * `true`: Turn on the keep client source IP function. After it is turned on, the back-end service is supported to view the original IP address of the client.
         * `false`: keep client source IP function is not turned on.
         * 
         * @return builder
         * 
         */
        public Builder proxyProtocol(@Nullable Output<Boolean> proxyProtocol) {
            $.proxyProtocol = proxyProtocol;
            return this;
        }

        /**
         * @param proxyProtocol The proxy protocol of the listener. Default value is `false`. Valid value:
         * `true`: Turn on the keep client source IP function. After it is turned on, the back-end service is supported to view the original IP address of the client.
         * `false`: keep client source IP function is not turned on.
         * 
         * @return builder
         * 
         */
        public Builder proxyProtocol(Boolean proxyProtocol) {
            return proxyProtocol(Output.of(proxyProtocol));
        }

        public ListenerArgs build() {
            $.acceleratorId = Objects.requireNonNull($.acceleratorId, "expected parameter 'acceleratorId' to be non-null");
            $.portRanges = Objects.requireNonNull($.portRanges, "expected parameter 'portRanges' to be non-null");
            return $;
        }
    }

}
