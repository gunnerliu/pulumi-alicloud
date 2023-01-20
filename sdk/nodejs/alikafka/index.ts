// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ConsumerGroupArgs, ConsumerGroupState } from "./consumerGroup";
export type ConsumerGroup = import("./consumerGroup").ConsumerGroup;
export const ConsumerGroup: typeof import("./consumerGroup").ConsumerGroup = null as any;
utilities.lazyLoad(exports, ["ConsumerGroup"], () => require("./consumerGroup"));

export { InstanceArgs, InstanceState } from "./instance";
export type Instance = import("./instance").Instance;
export const Instance: typeof import("./instance").Instance = null as any;
utilities.lazyLoad(exports, ["Instance"], () => require("./instance"));

export { InstanceAllowedIpAttachmentArgs, InstanceAllowedIpAttachmentState } from "./instanceAllowedIpAttachment";
export type InstanceAllowedIpAttachment = import("./instanceAllowedIpAttachment").InstanceAllowedIpAttachment;
export const InstanceAllowedIpAttachment: typeof import("./instanceAllowedIpAttachment").InstanceAllowedIpAttachment = null as any;
utilities.lazyLoad(exports, ["InstanceAllowedIpAttachment"], () => require("./instanceAllowedIpAttachment"));

export { SaslAclArgs, SaslAclState } from "./saslAcl";
export type SaslAcl = import("./saslAcl").SaslAcl;
export const SaslAcl: typeof import("./saslAcl").SaslAcl = null as any;
utilities.lazyLoad(exports, ["SaslAcl"], () => require("./saslAcl"));

export { SaslUserArgs, SaslUserState } from "./saslUser";
export type SaslUser = import("./saslUser").SaslUser;
export const SaslUser: typeof import("./saslUser").SaslUser = null as any;
utilities.lazyLoad(exports, ["SaslUser"], () => require("./saslUser"));

export { TopicArgs, TopicState } from "./topic";
export type Topic = import("./topic").Topic;
export const Topic: typeof import("./topic").Topic = null as any;
utilities.lazyLoad(exports, ["Topic"], () => require("./topic"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:alikafka/consumerGroup:ConsumerGroup":
                return new ConsumerGroup(name, <any>undefined, { urn })
            case "alicloud:alikafka/instance:Instance":
                return new Instance(name, <any>undefined, { urn })
            case "alicloud:alikafka/instanceAllowedIpAttachment:InstanceAllowedIpAttachment":
                return new InstanceAllowedIpAttachment(name, <any>undefined, { urn })
            case "alicloud:alikafka/saslAcl:SaslAcl":
                return new SaslAcl(name, <any>undefined, { urn })
            case "alicloud:alikafka/saslUser:SaslUser":
                return new SaslUser(name, <any>undefined, { urn })
            case "alicloud:alikafka/topic:Topic":
                return new Topic(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "alikafka/consumerGroup", _module)
pulumi.runtime.registerResourceModule("alicloud", "alikafka/instance", _module)
pulumi.runtime.registerResourceModule("alicloud", "alikafka/instanceAllowedIpAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "alikafka/saslAcl", _module)
pulumi.runtime.registerResourceModule("alicloud", "alikafka/saslUser", _module)
pulumi.runtime.registerResourceModule("alicloud", "alikafka/topic", _module)
