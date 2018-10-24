# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class Rule(pulumi.CustomResource):
    """
    A forwarding rule is configured in `HTTP`/`HTTPS` listener and it used to listen a list of backend servers which in one specified virtual backend server group.
    You can add forwarding rules to a listener to forward requests based on the domain names or the URL in the request.
    
    ~> **NOTE:** One virtual backend server group can be attached in multiple forwarding rules.
    
    ~> **NOTE:** At least one "Domain" or "Url" must be specified when creating a new rule.
    
    ~> **NOTE:** Having the same 'Domain' and 'Url' rule can not be created repeatedly in the one listener.
    
    ~> **NOTE:** Rule only be created in the `HTTP` or `HTTPS` listener.
    
    ~> **NOTE:** Only rule's virtual server group can be modified.
    """
    def __init__(__self__, __name__, __opts__=None, domain=None, frontend_port=None, load_balancer_id=None, name=None, server_group_id=None, url=None):
        """Create a Rule resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if domain and not isinstance(domain, basestring):
            raise TypeError('Expected property domain to be a basestring')
        __self__.domain = domain
        """
        Domain name of the forwarding rule. It can contain letters a-z, numbers 0-9, hyphens (-), and periods (.),
        and wildcard characters. The following two domain name formats are supported:
        - Standard domain name: www.test.com
        - Wildcard domain name: *.test.com. wildcard (*) must be the first character in the format of (*.)
        """
        __props__['domain'] = domain

        if not frontend_port:
            raise TypeError('Missing required property frontend_port')
        elif not isinstance(frontend_port, int):
            raise TypeError('Expected property frontend_port to be a int')
        __self__.frontend_port = frontend_port
        """
        The listener frontend port which is used to launch the new forwarding rule. Valid range: [1-65535].
        """
        __props__['frontendPort'] = frontend_port

        if not load_balancer_id:
            raise TypeError('Missing required property load_balancer_id')
        elif not isinstance(load_balancer_id, basestring):
            raise TypeError('Expected property load_balancer_id to be a basestring')
        __self__.load_balancer_id = load_balancer_id
        """
        The Load Balancer ID which is used to launch the new forwarding rule.
        """
        __props__['loadBalancerId'] = load_balancer_id

        if name and not isinstance(name, basestring):
            raise TypeError('Expected property name to be a basestring')
        __self__.name = name
        """
        Name of the forwarding rule. Our plugin provides a default name: "tf-slb-rule".
        """
        __props__['name'] = name

        if not server_group_id:
            raise TypeError('Missing required property server_group_id')
        elif not isinstance(server_group_id, basestring):
            raise TypeError('Expected property server_group_id to be a basestring')
        __self__.server_group_id = server_group_id
        """
        ID of a virtual server group that will be forwarded.
        """
        __props__['serverGroupId'] = server_group_id

        if url and not isinstance(url, basestring):
            raise TypeError('Expected property url to be a basestring')
        __self__.url = url
        """
        Domain of the forwarding rule. It must be 2-80 characters in length. Only letters a-z, numbers 0-9,
        and characters '-' '/' '?' '%' '#' and '&' are allowed. URLs must be started with the character '/', but cannot be '/' alone.
        """
        __props__['url'] = url

        super(Rule, __self__).__init__(
            'alicloud:slb/rule:Rule',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'domain' in outs:
            self.domain = outs['domain']
        if 'frontendPort' in outs:
            self.frontend_port = outs['frontendPort']
        if 'loadBalancerId' in outs:
            self.load_balancer_id = outs['loadBalancerId']
        if 'name' in outs:
            self.name = outs['name']
        if 'serverGroupId' in outs:
            self.server_group_id = outs['serverGroupId']
        if 'url' in outs:
            self.url = outs['url']