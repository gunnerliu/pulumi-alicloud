// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticTaskMonitorConfApiHttpRequestBodyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticTaskMonitorConfApiHttpRequestBodyArgs Empty = new SyntheticTaskMonitorConfApiHttpRequestBodyArgs();

    /**
     * The request body content, in JSON string format. When the type is text/plain,application/json,application/xml,text/html, the content can be converted to a JSON string.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The request body content, in JSON string format. When the type is text/plain,application/json,application/xml,text/html, the content can be converted to a JSON string.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * Assertion type, including: httpresead, httpresead, HttpResBody, HttpResBodyJson, httpressetime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet delay ms), icmppackwebscreen, fmppackavglatency (average delay rendering), TraceRouteHops (number of hops), dnsarecname, websiteOnload (full load time), see the supplement below for specific use.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Assertion type, including: httpresead, httpresead, HttpResBody, HttpResBodyJson, httpressetime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet delay ms), icmppackwebscreen, fmppackavglatency (average delay rendering), TraceRouteHops (number of hops), dnsarecname, websiteOnload (full load time), see the supplement below for specific use.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private SyntheticTaskMonitorConfApiHttpRequestBodyArgs() {}

    private SyntheticTaskMonitorConfApiHttpRequestBodyArgs(SyntheticTaskMonitorConfApiHttpRequestBodyArgs $) {
        this.content = $.content;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticTaskMonitorConfApiHttpRequestBodyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticTaskMonitorConfApiHttpRequestBodyArgs $;

        public Builder() {
            $ = new SyntheticTaskMonitorConfApiHttpRequestBodyArgs();
        }

        public Builder(SyntheticTaskMonitorConfApiHttpRequestBodyArgs defaults) {
            $ = new SyntheticTaskMonitorConfApiHttpRequestBodyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The request body content, in JSON string format. When the type is text/plain,application/json,application/xml,text/html, the content can be converted to a JSON string.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The request body content, in JSON string format. When the type is text/plain,application/json,application/xml,text/html, the content can be converted to a JSON string.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param type Assertion type, including: httpresead, httpresead, HttpResBody, HttpResBodyJson, httpressetime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet delay ms), icmppackwebscreen, fmppackavglatency (average delay rendering), TraceRouteHops (number of hops), dnsarecname, websiteOnload (full load time), see the supplement below for specific use.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Assertion type, including: httpresead, httpresead, HttpResBody, HttpResBodyJson, httpressetime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet delay ms), icmppackwebscreen, fmppackavglatency (average delay rendering), TraceRouteHops (number of hops), dnsarecname, websiteOnload (full load time), see the supplement below for specific use.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SyntheticTaskMonitorConfApiHttpRequestBodyArgs build() {
            return $;
        }
    }

}