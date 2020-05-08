# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class Domain(pulumi.CustomResource):
    cluster_type: pulumi.Output[str]
    """
    The type of the WAF cluster. Valid values: "PhysicalCluster" and "VirtualCluster". Default to "PhysicalCluster".
    """
    cname: pulumi.Output[str]
    """
    The CNAME record assigned by the WAF instance to the specified domain.
    """
    connection_time: pulumi.Output[float]
    """
    The connection timeout for WAF exclusive clusters. Unit: seconds.
    """
    domain: pulumi.Output[str]
    """
    The domain that you want to add to WAF.
    """
    http2_ports: pulumi.Output[list]
    """
    List of the HTTP 2.0 ports.
    """
    http_ports: pulumi.Output[list]
    """
    List of the HTTP ports
    """
    http_to_user_ip: pulumi.Output[str]
    """
    Specifies whether to enable the HTTP back-to-origin feature. After this feature is enabled, the WAF instance can use HTTP to forward HTTPS requests to the origin server. 
    By default, port 80 is used to forward the requests to the origin server. Valid values: "On" and "Off". Default to "Off".
    """
    https_ports: pulumi.Output[list]
    """
    List of the HTTPS ports
    """
    https_redirect: pulumi.Output[str]
    """
    Specifies whether to redirect HTTP requests as HTTPS requests. Valid values: "On" and "Off". Default to "Off".
    """
    instance_id: pulumi.Output[str]
    """
    The ID of the WAF instance.
    """
    is_access_product: pulumi.Output[str]
    """
    Specifies whether to configure a Layer-7 proxy, such as Anti-DDoS Pro or CDN, to filter the inbound traffic before it is forwarded to WAF. Valid values: "On" and "Off". Default to "Off".
    """
    load_balancing: pulumi.Output[str]
    """
    The load balancing algorithm that is used to forward requests to the origin. Valid values: "IpHash" and "RoundRobin". Default to "IpHash".
    """
    log_headers: pulumi.Output[list]
    """
    The key-value pair that is used to mark the traffic that flows through WAF to the domain. Each item contains two field:
    * key: The key of label
    * value: The value of label

      * `key` (`str`)
      * `value` (`str`)
    """
    read_time: pulumi.Output[float]
    """
    The read timeout of a WAF exclusive cluster. Unit: seconds.
    """
    resource_group_id: pulumi.Output[str]
    """
    The ID of the resource group to which the queried domain belongs in Resource Management. By default, no value is specified, indicating that the domain belongs to the default resource group.
    """
    source_ips: pulumi.Output[list]
    """
    List of the IP address or domain of the origin server to which the specified domain points.
    """
    status: pulumi.Output[float]
    write_time: pulumi.Output[float]
    """
    The timeout period for a WAF exclusive cluster write connection. Unit: seconds.
    """
    def __init__(__self__, resource_name, opts=None, cluster_type=None, connection_time=None, domain=None, http2_ports=None, http_ports=None, http_to_user_ip=None, https_ports=None, https_redirect=None, instance_id=None, is_access_product=None, load_balancing=None, log_headers=None, read_time=None, resource_group_id=None, source_ips=None, write_time=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a WAF Domain resource to create domain in the Web Application Firewall.

        For information about WAF and how to use it, see [What is Alibaba Cloud WAF](https://www.alibabacloud.com/help/doc-detail/28517.htm).

        > **NOTE:** Available in 1.82.0+ .



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_type: The type of the WAF cluster. Valid values: "PhysicalCluster" and "VirtualCluster". Default to "PhysicalCluster".
        :param pulumi.Input[float] connection_time: The connection timeout for WAF exclusive clusters. Unit: seconds.
        :param pulumi.Input[str] domain: The domain that you want to add to WAF.
        :param pulumi.Input[list] http2_ports: List of the HTTP 2.0 ports.
        :param pulumi.Input[list] http_ports: List of the HTTP ports
        :param pulumi.Input[str] http_to_user_ip: Specifies whether to enable the HTTP back-to-origin feature. After this feature is enabled, the WAF instance can use HTTP to forward HTTPS requests to the origin server. 
               By default, port 80 is used to forward the requests to the origin server. Valid values: "On" and "Off". Default to "Off".
        :param pulumi.Input[list] https_ports: List of the HTTPS ports
        :param pulumi.Input[str] https_redirect: Specifies whether to redirect HTTP requests as HTTPS requests. Valid values: "On" and "Off". Default to "Off".
        :param pulumi.Input[str] instance_id: The ID of the WAF instance.
        :param pulumi.Input[str] is_access_product: Specifies whether to configure a Layer-7 proxy, such as Anti-DDoS Pro or CDN, to filter the inbound traffic before it is forwarded to WAF. Valid values: "On" and "Off". Default to "Off".
        :param pulumi.Input[str] load_balancing: The load balancing algorithm that is used to forward requests to the origin. Valid values: "IpHash" and "RoundRobin". Default to "IpHash".
        :param pulumi.Input[list] log_headers: The key-value pair that is used to mark the traffic that flows through WAF to the domain. Each item contains two field:
               * key: The key of label
               * value: The value of label
        :param pulumi.Input[float] read_time: The read timeout of a WAF exclusive cluster. Unit: seconds.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the queried domain belongs in Resource Management. By default, no value is specified, indicating that the domain belongs to the default resource group.
        :param pulumi.Input[list] source_ips: List of the IP address or domain of the origin server to which the specified domain points.
        :param pulumi.Input[float] write_time: The timeout period for a WAF exclusive cluster write connection. Unit: seconds.

        The **log_headers** object supports the following:

          * `key` (`pulumi.Input[str]`)
          * `value` (`pulumi.Input[str]`)
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['cluster_type'] = cluster_type
            __props__['connection_time'] = connection_time
            if domain is None:
                raise TypeError("Missing required property 'domain'")
            __props__['domain'] = domain
            __props__['http2_ports'] = http2_ports
            __props__['http_ports'] = http_ports
            __props__['http_to_user_ip'] = http_to_user_ip
            __props__['https_ports'] = https_ports
            __props__['https_redirect'] = https_redirect
            if instance_id is None:
                raise TypeError("Missing required property 'instance_id'")
            __props__['instance_id'] = instance_id
            if is_access_product is None:
                raise TypeError("Missing required property 'is_access_product'")
            __props__['is_access_product'] = is_access_product
            __props__['load_balancing'] = load_balancing
            __props__['log_headers'] = log_headers
            __props__['read_time'] = read_time
            __props__['resource_group_id'] = resource_group_id
            if source_ips is None:
                raise TypeError("Missing required property 'source_ips'")
            __props__['source_ips'] = source_ips
            __props__['write_time'] = write_time
            __props__['cname'] = None
            __props__['status'] = None
        super(Domain, __self__).__init__(
            'alicloud:waf/domain:Domain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, cluster_type=None, cname=None, connection_time=None, domain=None, http2_ports=None, http_ports=None, http_to_user_ip=None, https_ports=None, https_redirect=None, instance_id=None, is_access_product=None, load_balancing=None, log_headers=None, read_time=None, resource_group_id=None, source_ips=None, status=None, write_time=None):
        """
        Get an existing Domain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_type: The type of the WAF cluster. Valid values: "PhysicalCluster" and "VirtualCluster". Default to "PhysicalCluster".
        :param pulumi.Input[str] cname: The CNAME record assigned by the WAF instance to the specified domain.
        :param pulumi.Input[float] connection_time: The connection timeout for WAF exclusive clusters. Unit: seconds.
        :param pulumi.Input[str] domain: The domain that you want to add to WAF.
        :param pulumi.Input[list] http2_ports: List of the HTTP 2.0 ports.
        :param pulumi.Input[list] http_ports: List of the HTTP ports
        :param pulumi.Input[str] http_to_user_ip: Specifies whether to enable the HTTP back-to-origin feature. After this feature is enabled, the WAF instance can use HTTP to forward HTTPS requests to the origin server. 
               By default, port 80 is used to forward the requests to the origin server. Valid values: "On" and "Off". Default to "Off".
        :param pulumi.Input[list] https_ports: List of the HTTPS ports
        :param pulumi.Input[str] https_redirect: Specifies whether to redirect HTTP requests as HTTPS requests. Valid values: "On" and "Off". Default to "Off".
        :param pulumi.Input[str] instance_id: The ID of the WAF instance.
        :param pulumi.Input[str] is_access_product: Specifies whether to configure a Layer-7 proxy, such as Anti-DDoS Pro or CDN, to filter the inbound traffic before it is forwarded to WAF. Valid values: "On" and "Off". Default to "Off".
        :param pulumi.Input[str] load_balancing: The load balancing algorithm that is used to forward requests to the origin. Valid values: "IpHash" and "RoundRobin". Default to "IpHash".
        :param pulumi.Input[list] log_headers: The key-value pair that is used to mark the traffic that flows through WAF to the domain. Each item contains two field:
               * key: The key of label
               * value: The value of label
        :param pulumi.Input[float] read_time: The read timeout of a WAF exclusive cluster. Unit: seconds.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the queried domain belongs in Resource Management. By default, no value is specified, indicating that the domain belongs to the default resource group.
        :param pulumi.Input[list] source_ips: List of the IP address or domain of the origin server to which the specified domain points.
        :param pulumi.Input[float] write_time: The timeout period for a WAF exclusive cluster write connection. Unit: seconds.

        The **log_headers** object supports the following:

          * `key` (`pulumi.Input[str]`)
          * `value` (`pulumi.Input[str]`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["cluster_type"] = cluster_type
        __props__["cname"] = cname
        __props__["connection_time"] = connection_time
        __props__["domain"] = domain
        __props__["http2_ports"] = http2_ports
        __props__["http_ports"] = http_ports
        __props__["http_to_user_ip"] = http_to_user_ip
        __props__["https_ports"] = https_ports
        __props__["https_redirect"] = https_redirect
        __props__["instance_id"] = instance_id
        __props__["is_access_product"] = is_access_product
        __props__["load_balancing"] = load_balancing
        __props__["log_headers"] = log_headers
        __props__["read_time"] = read_time
        __props__["resource_group_id"] = resource_group_id
        __props__["source_ips"] = source_ips
        __props__["status"] = status
        __props__["write_time"] = write_time
        return Domain(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

