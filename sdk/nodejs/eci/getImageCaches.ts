// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a collection of ECI Image Cache to the specified filters.
 *
 * > **NOTE:** Available in 1.90.0+.
 */
export function getImageCaches(args?: GetImageCachesArgs, opts?: pulumi.InvokeOptions): Promise<GetImageCachesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:eci/getImageCaches:getImageCaches", {
        "ids": args.ids,
        "image": args.image,
        "imageCacheName": args.imageCacheName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "snapshotId": args.snapshotId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getImageCaches.
 */
export interface GetImageCachesArgs {
    /**
     * A list ids of ECI Image Cache.
     */
    readonly ids?: string[];
    /**
     * Find the mirror cache containing it according to the image name.
     */
    readonly image?: string;
    /**
     * The name of ECI Image Cache.
     */
    readonly imageCacheName?: string;
    /**
     * A regex string to filter results by the image cache name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The id of snapshot.
     */
    readonly snapshotId?: string;
    /**
     * The status of ECI Image Cache.
     */
    readonly status?: string;
}

/**
 * A collection of values returned by getImageCaches.
 */
export interface GetImageCachesResult {
    /**
     * A list of caches. Each element contains the following attributes:
     */
    readonly caches: outputs.eci.GetImageCachesCach[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list ids of ECI Image Cache.
     */
    readonly ids: string[];
    readonly image?: string;
    /**
     * The name of the ECI Image Cache.
     */
    readonly imageCacheName?: string;
    readonly nameRegex?: string;
    /**
     * A list of ECI Image Cache names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The id of snapshot.
     */
    readonly snapshotId?: string;
    /**
     * The status of ECI Image Cache.
     */
    readonly status?: string;
}
