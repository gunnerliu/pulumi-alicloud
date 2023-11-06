# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServiceCertificateArgs', 'ServiceCertificate']

@pulumi.input_type
class ServiceCertificateArgs:
    def __init__(__self__, *,
                 cert: pulumi.Input[str],
                 key: pulumi.Input[str],
                 certificate_name: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServiceCertificate resource.
        :param pulumi.Input[str] cert: Cert of the Certificate in which the Certificate will add.
        :param pulumi.Input[str] key: Key of the Certificate in which the Certificate will add.
        :param pulumi.Input[str] certificate_name: Name of the Certificate. 
               This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
               and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
               Suffix .sh and .tel are not supported.
               **NOTE:** One of `certificate_name` and `name` must be specified.
        :param pulumi.Input[str] lang: The lang.
        :param pulumi.Input[str] name: It has been deprecated from version 1.129.0 and using `certificate_name` instead.
        """
        ServiceCertificateArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cert=cert,
            key=key,
            certificate_name=certificate_name,
            lang=lang,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cert: Optional[pulumi.Input[str]] = None,
             key: Optional[pulumi.Input[str]] = None,
             certificate_name: Optional[pulumi.Input[str]] = None,
             lang: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if cert is None:
            raise TypeError("Missing 'cert' argument")
        if key is None:
            raise TypeError("Missing 'key' argument")
        if certificate_name is None and 'certificateName' in kwargs:
            certificate_name = kwargs['certificateName']

        _setter("cert", cert)
        _setter("key", key)
        if certificate_name is not None:
            _setter("certificate_name", certificate_name)
        if lang is not None:
            _setter("lang", lang)
        if name is not None:
            warnings.warn("""attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.""")
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter
    def cert(self) -> pulumi.Input[str]:
        """
        Cert of the Certificate in which the Certificate will add.
        """
        return pulumi.get(self, "cert")

    @cert.setter
    def cert(self, value: pulumi.Input[str]):
        pulumi.set(self, "cert", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        Key of the Certificate in which the Certificate will add.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter(name="certificateName")
    def certificate_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Certificate. 
        This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
        and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
        Suffix .sh and .tel are not supported.
        **NOTE:** One of `certificate_name` and `name` must be specified.
        """
        return pulumi.get(self, "certificate_name")

    @certificate_name.setter
    def certificate_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_name", value)

    @property
    @pulumi.getter
    def lang(self) -> Optional[pulumi.Input[str]]:
        """
        The lang.
        """
        return pulumi.get(self, "lang")

    @lang.setter
    def lang(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lang", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        It has been deprecated from version 1.129.0 and using `certificate_name` instead.
        """
        warnings.warn("""attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""name is deprecated: attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.""")

        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ServiceCertificateState:
    def __init__(__self__, *,
                 cert: Optional[pulumi.Input[str]] = None,
                 certificate_name: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceCertificate resources.
        :param pulumi.Input[str] cert: Cert of the Certificate in which the Certificate will add.
        :param pulumi.Input[str] certificate_name: Name of the Certificate. 
               This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
               and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
               Suffix .sh and .tel are not supported.
               **NOTE:** One of `certificate_name` and `name` must be specified.
        :param pulumi.Input[str] key: Key of the Certificate in which the Certificate will add.
        :param pulumi.Input[str] lang: The lang.
        :param pulumi.Input[str] name: It has been deprecated from version 1.129.0 and using `certificate_name` instead.
        """
        _ServiceCertificateState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cert=cert,
            certificate_name=certificate_name,
            key=key,
            lang=lang,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cert: Optional[pulumi.Input[str]] = None,
             certificate_name: Optional[pulumi.Input[str]] = None,
             key: Optional[pulumi.Input[str]] = None,
             lang: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if certificate_name is None and 'certificateName' in kwargs:
            certificate_name = kwargs['certificateName']

        if cert is not None:
            _setter("cert", cert)
        if certificate_name is not None:
            _setter("certificate_name", certificate_name)
        if key is not None:
            _setter("key", key)
        if lang is not None:
            _setter("lang", lang)
        if name is not None:
            warnings.warn("""attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.""")
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter
    def cert(self) -> Optional[pulumi.Input[str]]:
        """
        Cert of the Certificate in which the Certificate will add.
        """
        return pulumi.get(self, "cert")

    @cert.setter
    def cert(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cert", value)

    @property
    @pulumi.getter(name="certificateName")
    def certificate_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Certificate. 
        This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
        and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
        Suffix .sh and .tel are not supported.
        **NOTE:** One of `certificate_name` and `name` must be specified.
        """
        return pulumi.get(self, "certificate_name")

    @certificate_name.setter
    def certificate_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_name", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        Key of the Certificate in which the Certificate will add.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def lang(self) -> Optional[pulumi.Input[str]]:
        """
        The lang.
        """
        return pulumi.get(self, "lang")

    @lang.setter
    def lang(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lang", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        It has been deprecated from version 1.129.0 and using `certificate_name` instead.
        """
        warnings.warn("""attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""name is deprecated: attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.""")

        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class ServiceCertificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cert: Optional[pulumi.Input[str]] = None,
                 certificate_name: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a SSL Certificates Certificate resource.

        For information about SSL Certificates Certificate and how to use it, see [What is Certificate](https://www.alibabacloud.com/help/product/28533.html).

        > **NOTE:** Available since v1.129.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.cas.ServiceCertificate("default",
            cert=\"\"\"-----BEGIN CERTIFICATE-----
        MIIDeDCCAmCgAwIBAgIEN3ZT6zANBgkqhkiG9w0BAQsFADBVMQswCQYDVQQGEwJD
        TjEVMBMGA1UEAwwMKi50ZnRlc3QudG9wMRAwDgYDVQQIDAdCZWlKaW5nMRAwDgYD
        VQQHDAdCZWlKaW5nMQswCQYDVQQKDAJBQTAeFw0yMzA4MjgwNjQ5NDNaFw0yNTA4
        MjcwNjQ5NDNaMFUxCzAJBgNVBAYTAkNOMRUwEwYDVQQDDAwqLnRmdGVzdC50b3Ax
        EDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcxCzAJBgNVBAoMAkFB
        MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzkk9NJUH7PLSQK4RRrGQ
        Y5dVsftkhnKh9HhI6yrnlowWIDPS1PZHOU/5gQ7xPUPGdKQV5S7x8wROnAaXEimx
        N4GdQw25pGhRJvlwme9fzJJiSe6lG49NCxmuBiEdJAzPKaTPpK1cG1f1TqdgCfHR
        HAL6Jxb3ylHG2LlTNFLXikubUi5RT6/9C8psr713Zm4HveCI/cx0WdgZ+fmsc9ft
        rkIB1DdyV1kQ51m8r2rLi3J7aC5ggGOiex/VlGSd4e6SOQLpdQEdDbodtOJ4LgVk
        +arFNCMinUWIOPGFzXhdm6lssPbh4MOBrz8c/M9TcF4hoMn5/o/9johZIZ/DOvXt
        ZQIDAQABo1AwTjAdBgNVHQ4EFgQUOnWiddgeZj17IeysatqhE361o5YwHwYDVR0j
        BBgwFoAUOnWiddgeZj17IeysatqhE361o5YwDAYDVR0TBAUwAwEB/zANBgkqhkiG
        9w0BAQsFAAOCAQEAfh3cnOszHM/5wXjY7BIkmgDOReksS+87ibhBz7T2ddZj+yCF
        9GdIBzXCiHpQFXpW8a3kc3I7l3nGfMTkmF6ld3ot/6SXP17QKJwxtvUA4ib8QkWD
        S7FT+UcHCUHv42Sh1e5uAlQ5pMSul7iKcR7jwlwZGZ0905HOqrmdyUGJ+Ud2uZWD
        AC0dJF6Bv9VhNtci8Imp05PaPH09deXLZu8LRrKRZFy9qLW5R6Swv7nzxckOAqDk
        TTc40xwvQROekWUyxeJL7xaHuylUHE0bxsiIfx5bZsBizRjprIwGlj85CSPuTZyP
        DPfaiZAN/61h5HNAnxLltOZfqabKYYw7l9LBDg==
        -----END CERTIFICATE-----

        \"\"\",
            certificate_name="tf-example",
            key=\"\"\"-----BEGIN PRIVATE KEY-----
        MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDOST00lQfs8tJA
        rhFGsZBjl1Wx+2SGcqH0eEjrKueWjBYgM9LU9kc5T/mBDvE9Q8Z0pBXlLvHzBE6c
        BpcSKbE3gZ1DDbmkaFEm+XCZ71/MkmJJ7qUbj00LGa4GIR0kDM8ppM+krVwbV/VO
        p2AJ8dEcAvonFvfKUcbYuVM0UteKS5tSLlFPr/0LymyvvXdmbge94Ij9zHRZ2Bn5
        +axz1+2uQgHUN3JXWRDnWbyvasuLcntoLmCAY6J7H9WUZJ3h7pI5Aul1AR0Nuh20
        4nguBWT5qsU0IyKdRYg48YXNeF2bqWyw9uHgw4GvPxz8z1NwXiGgyfn+j/2OiFkh
        n8M69e1lAgMBAAECggEAevPgTTT+0lYwx2h416ACJboP09O5KQGuUl5XaAPcoTjB
        /1OkOFbKQPjQCAJ1+0QoR2F9w2plv6kziX/MD4FWJXVV3J+TpNCgfhBy8u1gNjiR
        6Osa8gBJtXIK7ZBTJCeWWoXnVYoWuh2FEupkLck6D+4eV6oy6x4u3QIo+6jc24n9
        dIXQG6/v/Iao34kB0LUdp/4WNaUDvfI6NDhEwchpKE95dtWIDlIN/YhfiYAdjrnl
        YmH2VDbAGgsdEiHP4wLZfjgsGPPDGS0+qBHoSiJGH0E6wWEZdAE4TsYGRFsO86n3
        LfjEPFGfPlcnZe2cTTe3kmyKq/DTjxtu2rh3I8o2CQKBgQD/5Xe7cenaOBefzPlx
        GOEsB+qv49UmzEPOXDNZe9hmAawuuuxPUM+xlE++P+mEgQm1LPT4WWgtFLPVuwmx
        ncxt4CJNZh+ZGFyAZ4dm4M4ZhIBXNonyIP+yGyAJUUVF9Iy3TYcJNiGzv2Rx9JRQ
        XWJMQnTDILmZbmU+ltTea7/zqwKBgQDOXqCqb17MuLt7OcKWSgthm79OlaOdzZvl
        i9qU6VzZKG7Axc5gA9yq6tHp3vWPI4bNdvwqIIa/nzVILjGA5fcYFbRN+7gHwo8s
        rNAgi5PAoKWqQRovyJRY9Eq/sn6l1jbJZAOUAMZMWDm8z89OqK7PNQSIAtfFSneo
        2QxJkGeTLwKBgGJkafBB8af9b1/7YWISLepPNPbihH/BhMThAMGEdAVs2TaymtA4
        g1OFck/1pSVUtFXcbmjbf8ntruQcYbLQuNz6lFXsUXP9QPwCUrbE85ouL2bZSps2
        AvsJoPzUKe2nBUAp6CUrkjPaAJYsc6ae8X/fAaRRfeu33ef9+OV4yrq3AoGAYFZo
        ZmfrN2Kdkt7Z6dLTEVPlsMfGQ6pyNmxdM9rkzzNC0JcGymfDIb7RE35T3+hTy6La
        AMiCXv3xn6qAzY2NFh87tpPlyymWMOLTnf3Kkcfszlfp45idOBGCu46V9NDVbppT
        2UmrSIR/H5dbTXsNcAlt/hhlpeInjhkU1VqmH10CgYEA7Kk+QhWq705SczpWjm5J
        9kHqfFzJLwAWNBduiia0WypgPhLe/4wT1rYQkBtKMVKrgFo7Cvi4YKlrtlDnXyeU
        CIFqfEL5NriQelqrFsvgHsmD+MpvDoSWm5C8IrTubtlNyWUzXSVT4OIwzPobzPqG
        LILJ+e7bLw8RrM0HfgFnl8c=
        -----END PRIVATE KEY-----

        \"\"\")
        ```

        ## Import

        SSL Certificates Certificate can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cas/serviceCertificate:ServiceCertificate example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cert: Cert of the Certificate in which the Certificate will add.
        :param pulumi.Input[str] certificate_name: Name of the Certificate. 
               This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
               and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
               Suffix .sh and .tel are not supported.
               **NOTE:** One of `certificate_name` and `name` must be specified.
        :param pulumi.Input[str] key: Key of the Certificate in which the Certificate will add.
        :param pulumi.Input[str] lang: The lang.
        :param pulumi.Input[str] name: It has been deprecated from version 1.129.0 and using `certificate_name` instead.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceCertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a SSL Certificates Certificate resource.

        For information about SSL Certificates Certificate and how to use it, see [What is Certificate](https://www.alibabacloud.com/help/product/28533.html).

        > **NOTE:** Available since v1.129.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.cas.ServiceCertificate("default",
            cert=\"\"\"-----BEGIN CERTIFICATE-----
        MIIDeDCCAmCgAwIBAgIEN3ZT6zANBgkqhkiG9w0BAQsFADBVMQswCQYDVQQGEwJD
        TjEVMBMGA1UEAwwMKi50ZnRlc3QudG9wMRAwDgYDVQQIDAdCZWlKaW5nMRAwDgYD
        VQQHDAdCZWlKaW5nMQswCQYDVQQKDAJBQTAeFw0yMzA4MjgwNjQ5NDNaFw0yNTA4
        MjcwNjQ5NDNaMFUxCzAJBgNVBAYTAkNOMRUwEwYDVQQDDAwqLnRmdGVzdC50b3Ax
        EDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcxCzAJBgNVBAoMAkFB
        MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzkk9NJUH7PLSQK4RRrGQ
        Y5dVsftkhnKh9HhI6yrnlowWIDPS1PZHOU/5gQ7xPUPGdKQV5S7x8wROnAaXEimx
        N4GdQw25pGhRJvlwme9fzJJiSe6lG49NCxmuBiEdJAzPKaTPpK1cG1f1TqdgCfHR
        HAL6Jxb3ylHG2LlTNFLXikubUi5RT6/9C8psr713Zm4HveCI/cx0WdgZ+fmsc9ft
        rkIB1DdyV1kQ51m8r2rLi3J7aC5ggGOiex/VlGSd4e6SOQLpdQEdDbodtOJ4LgVk
        +arFNCMinUWIOPGFzXhdm6lssPbh4MOBrz8c/M9TcF4hoMn5/o/9johZIZ/DOvXt
        ZQIDAQABo1AwTjAdBgNVHQ4EFgQUOnWiddgeZj17IeysatqhE361o5YwHwYDVR0j
        BBgwFoAUOnWiddgeZj17IeysatqhE361o5YwDAYDVR0TBAUwAwEB/zANBgkqhkiG
        9w0BAQsFAAOCAQEAfh3cnOszHM/5wXjY7BIkmgDOReksS+87ibhBz7T2ddZj+yCF
        9GdIBzXCiHpQFXpW8a3kc3I7l3nGfMTkmF6ld3ot/6SXP17QKJwxtvUA4ib8QkWD
        S7FT+UcHCUHv42Sh1e5uAlQ5pMSul7iKcR7jwlwZGZ0905HOqrmdyUGJ+Ud2uZWD
        AC0dJF6Bv9VhNtci8Imp05PaPH09deXLZu8LRrKRZFy9qLW5R6Swv7nzxckOAqDk
        TTc40xwvQROekWUyxeJL7xaHuylUHE0bxsiIfx5bZsBizRjprIwGlj85CSPuTZyP
        DPfaiZAN/61h5HNAnxLltOZfqabKYYw7l9LBDg==
        -----END CERTIFICATE-----

        \"\"\",
            certificate_name="tf-example",
            key=\"\"\"-----BEGIN PRIVATE KEY-----
        MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDOST00lQfs8tJA
        rhFGsZBjl1Wx+2SGcqH0eEjrKueWjBYgM9LU9kc5T/mBDvE9Q8Z0pBXlLvHzBE6c
        BpcSKbE3gZ1DDbmkaFEm+XCZ71/MkmJJ7qUbj00LGa4GIR0kDM8ppM+krVwbV/VO
        p2AJ8dEcAvonFvfKUcbYuVM0UteKS5tSLlFPr/0LymyvvXdmbge94Ij9zHRZ2Bn5
        +axz1+2uQgHUN3JXWRDnWbyvasuLcntoLmCAY6J7H9WUZJ3h7pI5Aul1AR0Nuh20
        4nguBWT5qsU0IyKdRYg48YXNeF2bqWyw9uHgw4GvPxz8z1NwXiGgyfn+j/2OiFkh
        n8M69e1lAgMBAAECggEAevPgTTT+0lYwx2h416ACJboP09O5KQGuUl5XaAPcoTjB
        /1OkOFbKQPjQCAJ1+0QoR2F9w2plv6kziX/MD4FWJXVV3J+TpNCgfhBy8u1gNjiR
        6Osa8gBJtXIK7ZBTJCeWWoXnVYoWuh2FEupkLck6D+4eV6oy6x4u3QIo+6jc24n9
        dIXQG6/v/Iao34kB0LUdp/4WNaUDvfI6NDhEwchpKE95dtWIDlIN/YhfiYAdjrnl
        YmH2VDbAGgsdEiHP4wLZfjgsGPPDGS0+qBHoSiJGH0E6wWEZdAE4TsYGRFsO86n3
        LfjEPFGfPlcnZe2cTTe3kmyKq/DTjxtu2rh3I8o2CQKBgQD/5Xe7cenaOBefzPlx
        GOEsB+qv49UmzEPOXDNZe9hmAawuuuxPUM+xlE++P+mEgQm1LPT4WWgtFLPVuwmx
        ncxt4CJNZh+ZGFyAZ4dm4M4ZhIBXNonyIP+yGyAJUUVF9Iy3TYcJNiGzv2Rx9JRQ
        XWJMQnTDILmZbmU+ltTea7/zqwKBgQDOXqCqb17MuLt7OcKWSgthm79OlaOdzZvl
        i9qU6VzZKG7Axc5gA9yq6tHp3vWPI4bNdvwqIIa/nzVILjGA5fcYFbRN+7gHwo8s
        rNAgi5PAoKWqQRovyJRY9Eq/sn6l1jbJZAOUAMZMWDm8z89OqK7PNQSIAtfFSneo
        2QxJkGeTLwKBgGJkafBB8af9b1/7YWISLepPNPbihH/BhMThAMGEdAVs2TaymtA4
        g1OFck/1pSVUtFXcbmjbf8ntruQcYbLQuNz6lFXsUXP9QPwCUrbE85ouL2bZSps2
        AvsJoPzUKe2nBUAp6CUrkjPaAJYsc6ae8X/fAaRRfeu33ef9+OV4yrq3AoGAYFZo
        ZmfrN2Kdkt7Z6dLTEVPlsMfGQ6pyNmxdM9rkzzNC0JcGymfDIb7RE35T3+hTy6La
        AMiCXv3xn6qAzY2NFh87tpPlyymWMOLTnf3Kkcfszlfp45idOBGCu46V9NDVbppT
        2UmrSIR/H5dbTXsNcAlt/hhlpeInjhkU1VqmH10CgYEA7Kk+QhWq705SczpWjm5J
        9kHqfFzJLwAWNBduiia0WypgPhLe/4wT1rYQkBtKMVKrgFo7Cvi4YKlrtlDnXyeU
        CIFqfEL5NriQelqrFsvgHsmD+MpvDoSWm5C8IrTubtlNyWUzXSVT4OIwzPobzPqG
        LILJ+e7bLw8RrM0HfgFnl8c=
        -----END PRIVATE KEY-----

        \"\"\")
        ```

        ## Import

        SSL Certificates Certificate can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cas/serviceCertificate:ServiceCertificate example <id>
        ```

        :param str resource_name: The name of the resource.
        :param ServiceCertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceCertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ServiceCertificateArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cert: Optional[pulumi.Input[str]] = None,
                 certificate_name: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceCertificateArgs.__new__(ServiceCertificateArgs)

            if cert is None and not opts.urn:
                raise TypeError("Missing required property 'cert'")
            __props__.__dict__["cert"] = cert
            __props__.__dict__["certificate_name"] = certificate_name
            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__.__dict__["key"] = key
            __props__.__dict__["lang"] = lang
            __props__.__dict__["name"] = name
        super(ServiceCertificate, __self__).__init__(
            'alicloud:cas/serviceCertificate:ServiceCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cert: Optional[pulumi.Input[str]] = None,
            certificate_name: Optional[pulumi.Input[str]] = None,
            key: Optional[pulumi.Input[str]] = None,
            lang: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'ServiceCertificate':
        """
        Get an existing ServiceCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cert: Cert of the Certificate in which the Certificate will add.
        :param pulumi.Input[str] certificate_name: Name of the Certificate. 
               This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
               and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
               Suffix .sh and .tel are not supported.
               **NOTE:** One of `certificate_name` and `name` must be specified.
        :param pulumi.Input[str] key: Key of the Certificate in which the Certificate will add.
        :param pulumi.Input[str] lang: The lang.
        :param pulumi.Input[str] name: It has been deprecated from version 1.129.0 and using `certificate_name` instead.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceCertificateState.__new__(_ServiceCertificateState)

        __props__.__dict__["cert"] = cert
        __props__.__dict__["certificate_name"] = certificate_name
        __props__.__dict__["key"] = key
        __props__.__dict__["lang"] = lang
        __props__.__dict__["name"] = name
        return ServiceCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def cert(self) -> pulumi.Output[str]:
        """
        Cert of the Certificate in which the Certificate will add.
        """
        return pulumi.get(self, "cert")

    @property
    @pulumi.getter(name="certificateName")
    def certificate_name(self) -> pulumi.Output[str]:
        """
        Name of the Certificate. 
        This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
        and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
        Suffix .sh and .tel are not supported.
        **NOTE:** One of `certificate_name` and `name` must be specified.
        """
        return pulumi.get(self, "certificate_name")

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        Key of the Certificate in which the Certificate will add.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def lang(self) -> pulumi.Output[Optional[str]]:
        """
        The lang.
        """
        return pulumi.get(self, "lang")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        It has been deprecated from version 1.129.0 and using `certificate_name` instead.
        """
        warnings.warn("""attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""name is deprecated: attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.""")

        return pulumi.get(self, "name")

