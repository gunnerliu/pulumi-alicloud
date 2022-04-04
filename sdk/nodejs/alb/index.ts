// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./acl";
export * from "./getAcls";
export * from "./getHealthCheckTemplates";
export * from "./getListeners";
export * from "./getLoadBalancers";
export * from "./getRules";
export * from "./getSecurityPolicies";
export * from "./getServerGroups";
export * from "./getZones";
export * from "./healthCheckTemplate";
export * from "./listener";
export * from "./listenerAdditionalCertificateAttachment";
export * from "./loadBalancer";
export * from "./rule";
export * from "./securityPolicy";
export * from "./serverGroup";

// Import resources to register:
import { Acl } from "./acl";
import { HealthCheckTemplate } from "./healthCheckTemplate";
import { Listener } from "./listener";
import { ListenerAdditionalCertificateAttachment } from "./listenerAdditionalCertificateAttachment";
import { LoadBalancer } from "./loadBalancer";
import { Rule } from "./rule";
import { SecurityPolicy } from "./securityPolicy";
import { ServerGroup } from "./serverGroup";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:alb/acl:Acl":
                return new Acl(name, <any>undefined, { urn })
            case "alicloud:alb/healthCheckTemplate:HealthCheckTemplate":
                return new HealthCheckTemplate(name, <any>undefined, { urn })
            case "alicloud:alb/listener:Listener":
                return new Listener(name, <any>undefined, { urn })
            case "alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment":
                return new ListenerAdditionalCertificateAttachment(name, <any>undefined, { urn })
            case "alicloud:alb/loadBalancer:LoadBalancer":
                return new LoadBalancer(name, <any>undefined, { urn })
            case "alicloud:alb/rule:Rule":
                return new Rule(name, <any>undefined, { urn })
            case "alicloud:alb/securityPolicy:SecurityPolicy":
                return new SecurityPolicy(name, <any>undefined, { urn })
            case "alicloud:alb/serverGroup:ServerGroup":
                return new ServerGroup(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "alb/acl", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/healthCheckTemplate", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/listener", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/listenerAdditionalCertificateAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/loadBalancer", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/rule", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/securityPolicy", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/serverGroup", _module)
