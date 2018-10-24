"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
let __config = new pulumi.Config("alicloud");
/**
 * Access key of alicloud
 */
exports.accessKey = __config.require("accessKey");
/**
 * Alibaba Cloud account ID
 */
exports.accountId = __config.get("accountId");
/**
 * Custom function compute endpoints
 */
exports.fc = __config.get("fc");
/**
 * Alibaba Cloud log service self-define endpoint
 */
exports.logEndpoint = __config.get("logEndpoint");
/**
 * Alibaba Cloud mns service self-define endpoint
 */
exports.mnsEndpoint = __config.get("mnsEndpoint");
exports.otsInstanceName = __config.get("otsInstanceName");
/**
 * Region of alicloud
 */
exports.region = __config.require("region");
/**
 * Secret key of alicloud
 */
exports.secretKey = __config.require("secretKey");
/**
 * Alibaba Cloud Security Token
 */
exports.securityToken = __config.get("securityToken");
//# sourceMappingURL=vars.js.map