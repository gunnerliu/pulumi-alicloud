// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Amqp Virtual Hosts of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.126.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.amqp.getVirtualHosts({
 *     instanceId: "amqp-abc12345",
 *     ids: [
 *         "my-VirtualHost-1",
 *         "my-VirtualHost-2",
 *     ],
 * });
 * export const amqpVirtualHostId1 = ids.then(ids => ids.hosts[0].id);
 * const nameRegex = alicloud.amqp.getVirtualHosts({
 *     instanceId: "amqp-abc12345",
 *     nameRegex: "^my-VirtualHost",
 * });
 * export const amqpVirtualHostId2 = nameRegex.then(nameRegex => nameRegex.hosts[0].id);
 * ```
 */
export function getVirtualHosts(args: GetVirtualHostsArgs, opts?: pulumi.InvokeOptions): Promise<GetVirtualHostsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:amqp/getVirtualHosts:getVirtualHosts", {
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualHosts.
 */
export interface GetVirtualHostsArgs {
    /**
     * A list of Virtual Host IDs. Its element value is same as Virtual Host Name.
     */
    readonly ids?: string[];
    /**
     * InstanceId.
     */
    readonly instanceId: string;
    /**
     * A regex string to filter results by Virtual Host name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getVirtualHosts.
 */
export interface GetVirtualHostsResult {
    readonly hosts: outputs.amqp.GetVirtualHostsHost[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
}
