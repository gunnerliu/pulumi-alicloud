// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.alicloud.servicemesh.outputs.GetServiceMeshesMeshMeshConfigAccessLog;
import com.pulumi.alicloud.servicemesh.outputs.GetServiceMeshesMeshMeshConfigAudit;
import com.pulumi.alicloud.servicemesh.outputs.GetServiceMeshesMeshMeshConfigControlPlaneLog;
import com.pulumi.alicloud.servicemesh.outputs.GetServiceMeshesMeshMeshConfigKiali;
import com.pulumi.alicloud.servicemesh.outputs.GetServiceMeshesMeshMeshConfigOpa;
import com.pulumi.alicloud.servicemesh.outputs.GetServiceMeshesMeshMeshConfigPilot;
import com.pulumi.alicloud.servicemesh.outputs.GetServiceMeshesMeshMeshConfigPrometheus;
import com.pulumi.alicloud.servicemesh.outputs.GetServiceMeshesMeshMeshConfigProxy;
import com.pulumi.alicloud.servicemesh.outputs.GetServiceMeshesMeshMeshConfigSidecarInjector;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceMeshesMeshMeshConfig {
    /**
     * @return The configuration of the access logging.
     * 
     */
    private final List<GetServiceMeshesMeshMeshConfigAccessLog> accessLogs;
    /**
     * @return The configuration of the Service grid audit.
     * 
     */
    private final List<GetServiceMeshesMeshMeshConfigAudit> audits;
    /**
     * @return The configuration of the control plane logging. **NOTE:** Available in 1.174.0+
     * 
     */
    private final List<GetServiceMeshesMeshMeshConfigControlPlaneLog> controlPlaneLogs;
    /**
     * @return Whether or not to enable the use of a custom zipkin.
     * 
     */
    private final Boolean customizedZipkin;
    /**
     * @return Whether to enable service can access the service through the nearest node access.
     * 
     */
    private final Boolean enableLocalityLb;
    /**
     * @return The IP ADDRESS range.
     * 
     */
    private final String includeIpRanges;
    /**
     * @return The configuration of the Kiali.
     * 
     */
    private final List<GetServiceMeshesMeshMeshConfigKiali> kialis;
    /**
     * @return The open-door policy of agent (OPA) plug-in information.
     * 
     */
    private final List<GetServiceMeshesMeshMeshConfigOpa> opas;
    /**
     * @return The policy of the Out to the traffic. Valid values: `ALLOW_ANY` and `REGISTRY_ONLY`.
     * 
     */
    private final String outboundTrafficPolicy;
    /**
     * @return The configuration of the Link trace sampling.
     * 
     */
    private final List<GetServiceMeshesMeshMeshConfigPilot> pilots;
    /**
     * @return the configuration of the Prometheus.
     * 
     */
    private final List<GetServiceMeshesMeshMeshConfigPrometheus> prometheuses;
    /**
     * @return The configuration of the Proxy.
     * 
     */
    private final List<GetServiceMeshesMeshMeshConfigProxy> proxies;
    /**
     * @return The configuration of the Sidecar injector.
     * 
     */
    private final List<GetServiceMeshesMeshMeshConfigSidecarInjector> sidecarInjectors;
    /**
     * @return Whether to enable acquisition Prometheus metrics.
     * 
     */
    private final Boolean telemetry;
    /**
     * @return Whether to enable link trace.
     * 
     */
    private final Boolean tracing;

    @CustomType.Constructor
    private GetServiceMeshesMeshMeshConfig(
        @CustomType.Parameter("accessLogs") List<GetServiceMeshesMeshMeshConfigAccessLog> accessLogs,
        @CustomType.Parameter("audits") List<GetServiceMeshesMeshMeshConfigAudit> audits,
        @CustomType.Parameter("controlPlaneLogs") List<GetServiceMeshesMeshMeshConfigControlPlaneLog> controlPlaneLogs,
        @CustomType.Parameter("customizedZipkin") Boolean customizedZipkin,
        @CustomType.Parameter("enableLocalityLb") Boolean enableLocalityLb,
        @CustomType.Parameter("includeIpRanges") String includeIpRanges,
        @CustomType.Parameter("kialis") List<GetServiceMeshesMeshMeshConfigKiali> kialis,
        @CustomType.Parameter("opas") List<GetServiceMeshesMeshMeshConfigOpa> opas,
        @CustomType.Parameter("outboundTrafficPolicy") String outboundTrafficPolicy,
        @CustomType.Parameter("pilots") List<GetServiceMeshesMeshMeshConfigPilot> pilots,
        @CustomType.Parameter("prometheuses") List<GetServiceMeshesMeshMeshConfigPrometheus> prometheuses,
        @CustomType.Parameter("proxies") List<GetServiceMeshesMeshMeshConfigProxy> proxies,
        @CustomType.Parameter("sidecarInjectors") List<GetServiceMeshesMeshMeshConfigSidecarInjector> sidecarInjectors,
        @CustomType.Parameter("telemetry") Boolean telemetry,
        @CustomType.Parameter("tracing") Boolean tracing) {
        this.accessLogs = accessLogs;
        this.audits = audits;
        this.controlPlaneLogs = controlPlaneLogs;
        this.customizedZipkin = customizedZipkin;
        this.enableLocalityLb = enableLocalityLb;
        this.includeIpRanges = includeIpRanges;
        this.kialis = kialis;
        this.opas = opas;
        this.outboundTrafficPolicy = outboundTrafficPolicy;
        this.pilots = pilots;
        this.prometheuses = prometheuses;
        this.proxies = proxies;
        this.sidecarInjectors = sidecarInjectors;
        this.telemetry = telemetry;
        this.tracing = tracing;
    }

    /**
     * @return The configuration of the access logging.
     * 
     */
    public List<GetServiceMeshesMeshMeshConfigAccessLog> accessLogs() {
        return this.accessLogs;
    }
    /**
     * @return The configuration of the Service grid audit.
     * 
     */
    public List<GetServiceMeshesMeshMeshConfigAudit> audits() {
        return this.audits;
    }
    /**
     * @return The configuration of the control plane logging. **NOTE:** Available in 1.174.0+
     * 
     */
    public List<GetServiceMeshesMeshMeshConfigControlPlaneLog> controlPlaneLogs() {
        return this.controlPlaneLogs;
    }
    /**
     * @return Whether or not to enable the use of a custom zipkin.
     * 
     */
    public Boolean customizedZipkin() {
        return this.customizedZipkin;
    }
    /**
     * @return Whether to enable service can access the service through the nearest node access.
     * 
     */
    public Boolean enableLocalityLb() {
        return this.enableLocalityLb;
    }
    /**
     * @return The IP ADDRESS range.
     * 
     */
    public String includeIpRanges() {
        return this.includeIpRanges;
    }
    /**
     * @return The configuration of the Kiali.
     * 
     */
    public List<GetServiceMeshesMeshMeshConfigKiali> kialis() {
        return this.kialis;
    }
    /**
     * @return The open-door policy of agent (OPA) plug-in information.
     * 
     */
    public List<GetServiceMeshesMeshMeshConfigOpa> opas() {
        return this.opas;
    }
    /**
     * @return The policy of the Out to the traffic. Valid values: `ALLOW_ANY` and `REGISTRY_ONLY`.
     * 
     */
    public String outboundTrafficPolicy() {
        return this.outboundTrafficPolicy;
    }
    /**
     * @return The configuration of the Link trace sampling.
     * 
     */
    public List<GetServiceMeshesMeshMeshConfigPilot> pilots() {
        return this.pilots;
    }
    /**
     * @return the configuration of the Prometheus.
     * 
     */
    public List<GetServiceMeshesMeshMeshConfigPrometheus> prometheuses() {
        return this.prometheuses;
    }
    /**
     * @return The configuration of the Proxy.
     * 
     */
    public List<GetServiceMeshesMeshMeshConfigProxy> proxies() {
        return this.proxies;
    }
    /**
     * @return The configuration of the Sidecar injector.
     * 
     */
    public List<GetServiceMeshesMeshMeshConfigSidecarInjector> sidecarInjectors() {
        return this.sidecarInjectors;
    }
    /**
     * @return Whether to enable acquisition Prometheus metrics.
     * 
     */
    public Boolean telemetry() {
        return this.telemetry;
    }
    /**
     * @return Whether to enable link trace.
     * 
     */
    public Boolean tracing() {
        return this.tracing;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceMeshesMeshMeshConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetServiceMeshesMeshMeshConfigAccessLog> accessLogs;
        private List<GetServiceMeshesMeshMeshConfigAudit> audits;
        private List<GetServiceMeshesMeshMeshConfigControlPlaneLog> controlPlaneLogs;
        private Boolean customizedZipkin;
        private Boolean enableLocalityLb;
        private String includeIpRanges;
        private List<GetServiceMeshesMeshMeshConfigKiali> kialis;
        private List<GetServiceMeshesMeshMeshConfigOpa> opas;
        private String outboundTrafficPolicy;
        private List<GetServiceMeshesMeshMeshConfigPilot> pilots;
        private List<GetServiceMeshesMeshMeshConfigPrometheus> prometheuses;
        private List<GetServiceMeshesMeshMeshConfigProxy> proxies;
        private List<GetServiceMeshesMeshMeshConfigSidecarInjector> sidecarInjectors;
        private Boolean telemetry;
        private Boolean tracing;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceMeshesMeshMeshConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogs = defaults.accessLogs;
    	      this.audits = defaults.audits;
    	      this.controlPlaneLogs = defaults.controlPlaneLogs;
    	      this.customizedZipkin = defaults.customizedZipkin;
    	      this.enableLocalityLb = defaults.enableLocalityLb;
    	      this.includeIpRanges = defaults.includeIpRanges;
    	      this.kialis = defaults.kialis;
    	      this.opas = defaults.opas;
    	      this.outboundTrafficPolicy = defaults.outboundTrafficPolicy;
    	      this.pilots = defaults.pilots;
    	      this.prometheuses = defaults.prometheuses;
    	      this.proxies = defaults.proxies;
    	      this.sidecarInjectors = defaults.sidecarInjectors;
    	      this.telemetry = defaults.telemetry;
    	      this.tracing = defaults.tracing;
        }

        public Builder accessLogs(List<GetServiceMeshesMeshMeshConfigAccessLog> accessLogs) {
            this.accessLogs = Objects.requireNonNull(accessLogs);
            return this;
        }
        public Builder accessLogs(GetServiceMeshesMeshMeshConfigAccessLog... accessLogs) {
            return accessLogs(List.of(accessLogs));
        }
        public Builder audits(List<GetServiceMeshesMeshMeshConfigAudit> audits) {
            this.audits = Objects.requireNonNull(audits);
            return this;
        }
        public Builder audits(GetServiceMeshesMeshMeshConfigAudit... audits) {
            return audits(List.of(audits));
        }
        public Builder controlPlaneLogs(List<GetServiceMeshesMeshMeshConfigControlPlaneLog> controlPlaneLogs) {
            this.controlPlaneLogs = Objects.requireNonNull(controlPlaneLogs);
            return this;
        }
        public Builder controlPlaneLogs(GetServiceMeshesMeshMeshConfigControlPlaneLog... controlPlaneLogs) {
            return controlPlaneLogs(List.of(controlPlaneLogs));
        }
        public Builder customizedZipkin(Boolean customizedZipkin) {
            this.customizedZipkin = Objects.requireNonNull(customizedZipkin);
            return this;
        }
        public Builder enableLocalityLb(Boolean enableLocalityLb) {
            this.enableLocalityLb = Objects.requireNonNull(enableLocalityLb);
            return this;
        }
        public Builder includeIpRanges(String includeIpRanges) {
            this.includeIpRanges = Objects.requireNonNull(includeIpRanges);
            return this;
        }
        public Builder kialis(List<GetServiceMeshesMeshMeshConfigKiali> kialis) {
            this.kialis = Objects.requireNonNull(kialis);
            return this;
        }
        public Builder kialis(GetServiceMeshesMeshMeshConfigKiali... kialis) {
            return kialis(List.of(kialis));
        }
        public Builder opas(List<GetServiceMeshesMeshMeshConfigOpa> opas) {
            this.opas = Objects.requireNonNull(opas);
            return this;
        }
        public Builder opas(GetServiceMeshesMeshMeshConfigOpa... opas) {
            return opas(List.of(opas));
        }
        public Builder outboundTrafficPolicy(String outboundTrafficPolicy) {
            this.outboundTrafficPolicy = Objects.requireNonNull(outboundTrafficPolicy);
            return this;
        }
        public Builder pilots(List<GetServiceMeshesMeshMeshConfigPilot> pilots) {
            this.pilots = Objects.requireNonNull(pilots);
            return this;
        }
        public Builder pilots(GetServiceMeshesMeshMeshConfigPilot... pilots) {
            return pilots(List.of(pilots));
        }
        public Builder prometheuses(List<GetServiceMeshesMeshMeshConfigPrometheus> prometheuses) {
            this.prometheuses = Objects.requireNonNull(prometheuses);
            return this;
        }
        public Builder prometheuses(GetServiceMeshesMeshMeshConfigPrometheus... prometheuses) {
            return prometheuses(List.of(prometheuses));
        }
        public Builder proxies(List<GetServiceMeshesMeshMeshConfigProxy> proxies) {
            this.proxies = Objects.requireNonNull(proxies);
            return this;
        }
        public Builder proxies(GetServiceMeshesMeshMeshConfigProxy... proxies) {
            return proxies(List.of(proxies));
        }
        public Builder sidecarInjectors(List<GetServiceMeshesMeshMeshConfigSidecarInjector> sidecarInjectors) {
            this.sidecarInjectors = Objects.requireNonNull(sidecarInjectors);
            return this;
        }
        public Builder sidecarInjectors(GetServiceMeshesMeshMeshConfigSidecarInjector... sidecarInjectors) {
            return sidecarInjectors(List.of(sidecarInjectors));
        }
        public Builder telemetry(Boolean telemetry) {
            this.telemetry = Objects.requireNonNull(telemetry);
            return this;
        }
        public Builder tracing(Boolean tracing) {
            this.tracing = Objects.requireNonNull(tracing);
            return this;
        }        public GetServiceMeshesMeshMeshConfig build() {
            return new GetServiceMeshesMeshMeshConfig(accessLogs, audits, controlPlaneLogs, customizedZipkin, enableLocalityLb, includeIpRanges, kialis, opas, outboundTrafficPolicy, pilots, prometheuses, proxies, sidecarInjectors, telemetry, tracing);
        }
    }
}
